package com.cts.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.dao.loanValidation;
import com.cts.model.CustomerLogin;
import com.cts.model.applyloan;

/**
 * Servlet implementation class ApplyLoanServlet
 */
@WebServlet("/ApplyLoanServlet")
public class ApplyLoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;
	PreparedStatement s = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con=DBUtil.getConnection();
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		applyloan al = new applyloan();
		String email = request.getParameter("email");
		Long loanamount = (Long.parseLong(request.getParameter("loanamount")));
		String pan = request.getParameter("pan");
		String aadhar = request.getParameter("aadhar");
		Long propertyvalue = Long.parseLong(request.getParameter("property"));
		//String status = "Applied";
		
		int res=0;
		
		try {
			s=con.prepareStatement("insert into ApplyLoan(EMAILID,loan_value,pan_id,adhar_id,property_val) values (?,?,?,?,?)");
			s.setString(1, email);
			s.setLong(2, loanamount);
			s.setString(3, pan);
			s.setString(4, aadhar);
			s.setLong(5, propertyvalue);
			
			res = s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res !=0)
		{
			List<applyloan> alist = loanValidation.checkloanAmount(loanamount, propertyvalue);
			{
				for(applyloan a:alist)
					System.out.println(a);
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("applicationsubmitted.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("applyLoan.html");
			rd.forward(request, response);
		}
		
	}

}
