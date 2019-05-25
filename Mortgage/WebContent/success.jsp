<%-- 
    Document   : success
    Created on : 18 Oct, 2018, 7:42:26 PM
    Author     : Dharmesh Mourya
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    
        <c:if test="${requestScope.msg!=null}">
        <h3><c:out value="${requestScope.msg}"></c:out></h3>
        </c:if><br><br>
        <c:if test="${sessionScope.fileName!=null}">
            <c:set var = "file" scope = "session" value = "${sessionScope.fileName}"/>  
        </c:if>
        
        
        <% String path=(String) request.getAttribute("path");
        //out.print("path : " +path);
        %>
        
        <%String fn = (String) request.getAttribute("filename1");
        path = path + File.separator +fn; 
        out.print("src path : " +path); %>
        <a href = "<c:url value = "DownloadServlet?fileName=${file}"/>">Download</a>&nbsp;&nbsp;&nbsp;
        <a href = "<c:url value = "file-list.jsp"/>">View List</a>
      
</html>
