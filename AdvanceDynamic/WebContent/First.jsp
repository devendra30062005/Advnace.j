<%@page import="jdk.nashorn.api.tree.ForInLoopTree"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
<% 
for(int i = 1;i<=5;i++){
%>
<h1><%=i %> Hello this my First JSP</h1>
<%} %>



</body>
</html>