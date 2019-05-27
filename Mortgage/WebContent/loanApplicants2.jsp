<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.cts.model.applyloan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<%
ArrayList<applyloan> clist = new ArrayList();
clist = (ArrayList<applyloan>)request.getAttribute("loan");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title> Loan Sanctioned Applicants List </title>
        
        
        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
        <script src="https://code.jquery.com/jquery-1.12.3.js"></script>
        
        <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
        
        <script>
        $(document).ready(function(){
        $('#myTable').dataTable();

        });
        </script>
        
        
</head>
<body>
 
   
    
    
    
<div class="container">
<h2> LoanApplicants List </h2>
<div class="table-responsive">
<table id="myTable" class="display table">

    <thead>
    <tr>
    <th>Application ID</th>
    <th> EmailId </th>
    <th> Loan value </th>
     <th> Pan id </th>
     <th> Aadhar id </th>
     <th> Property value </th>
     
    
     
    </tr>
    </thead>
        <tbody>
        <%for(int i = 0;i<clist.size();i++)
        {
        	applyloan c = new applyloan();
        	c = clist.get(i);
        
        %>
        
        <tr>
        <td><%=c.getApplicationId() %></td>
        <td><%=c.getEmailId() %></td>
        <td><%=c.getLoanamount() %></td>
        <td><%=c.getPanId() %></td>
        <td><%=c.getAadharId()%></td>
        <td><%=c.getPropertyvalue()%></td>
       
        </tr>
        <%
        };
        %>
        </tbody>
</table>
</div>
</div>
</body>
</html>



