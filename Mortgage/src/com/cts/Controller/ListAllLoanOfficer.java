package com.cts.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Customer;
import com.cts.service.CustomerService;
import com.cts.service.CustomerServiceImpl;


@WebServlet("/ListAllLoanOfficer")
public class ListAllLoanOfficer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();


		CustomerService cs = new CustomerServiceImpl();
		
		List<Customer> clist = new ArrayList<>();
		
		clist = cs.listAll();		
//pw.write(clist);

		
List customer= null;

//for(Customer c:clist)
//{
//	customer.add(c.getCustomerId());
//	customer.add(c.getName());
//	customer.add(c.getEmailId());
//	customer.add(c.getMobileNumber());
//	customer.add(c.getDob());
//	customer.add(c.getCity());
//	customer.add(c.getState());
//	 
//}
//
//System.out.println("data"+customer);


request.setAttribute("customer", clist);
RequestDispatcher rd = request.getRequestDispatcher("AllApplicants.jsp");
rd.forward(request, response);

		
	}

}
