<%@page import="java.io.File"%>
<%@page import="com.cts.dao.DBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            tr,td,th{
                padding: 20px;
                text-align: center;
            }
        </style>
        
    </head>
    <body>
        <br><br><br>
    <center>
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String im="";
        %>
        <table border="2">
            <tr>
                <th>ID</th><th>pan_id</th><th>passport_id</th><th>document_proof_image</th><th>document_value</th><th>status</th><th>filename</th>
            </tr>
            <%
                con = DBUtil.getConnection();
            String sql = "select * from documents_table";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
                <td><%=rs.getString(7)%>
                <td> <img src="<%=rs.getString(3)%>" alt="file">           </td>
                <td><a href="DownloadServlet?fileName=<%=rs.getString(4)%>">Download</a></td>
            </tr>
            <%
                im= request.getServletContext().getRealPath("")  +rs.getString(4);
                
                %>
           <!--     Image:   
            <img src="<%=im%>" />  -->
                <%
             }
            %>
        </table><br>
        <a href="uploadDocs.jsp">Home</a>
    </center>
    </body>
</html>
