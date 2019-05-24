<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.cts.model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<%
ArrayList<Customer> clist = new ArrayList();
clist = (ArrayList<Customer>)request.getAttribute("customer");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title> candidates List </title>
        
        
        
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
<h2> Candidates List </h2>
<div class="table-responsive">
<table id="myTable" class="display table">

    <thead>
    <tr>
    <th>Customer Id</th>
    <th> Customer Name </th>
    <th> EmailId </th>
     <th> Mobile Number </th>
     <th> DOB </th>
     <th> City </th>
     <th> State </th>
     
    </tr>
    </thead>
        <tbody>
        <%for(int i = 0;i<clist.size();i++)
        {
        	Customer c = new Customer();
        	c = clist.get(i);
        
        %>
        
        <tr>
        <td><%=c.getCustomerId() %></td>
        <td><%=c.getName() %></td>
        <td><%=c.getEmailId() %></td>
        <td><%=c.getMobileNumber() %></td>
        <td><%=c.getDob() %></td>
        <td><%=c.getCity() %></td>
        <td><%=c.getState() %></td>
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



                           