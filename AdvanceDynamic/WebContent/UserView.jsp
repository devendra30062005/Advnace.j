<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Header.jsp" %>
	<form action="UserCtl" method="post">
		
		<%
		UserBean bean=(UserBean) request.getAttribute("bean");
			String msg = (String) request.getAttribute("msg");
		%>
		
			
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>
			
				<% if(bean != null){ %>
		
		<table>
			<tr>
				<td>FirstName</td>
				<th><input type="text" name="firstName" value="<%= bean.getFirst_name()%>"></th>
			</tr>
			<tr>
				<td>LastName</td>
				<th><input type="text" name="lastName" value="<%= bean.getLast_name()%>"></th>
			</tr>
			<tr>
				<td>LoginId</td>
				<th><input type="text" name="loginId" value="<%= bean.getLogin_id()%>"></th>
			</tr>
			<tr>
				<td>password</td>
				<th><input type="text" name="password" value="<%= bean.getPassword()%>"></th>
			</tr>
			<tr>
				<td>dob</td>
				<th><input type="date" name="dob" value="<%= bean.getDob()%>"></th>
			</tr>
			<tr>
				<td>address</td>
				<th><input type="" name="address" value="<%= bean.getAddress()%>"></th>
			</tr>
			<tr>
				<td></td>
				<th><input type="submit" ></th>
			</tr>
		</table>
		<%}else { %>
			<%
					if (bean == null) {
				%>
				<table>
		
			<tr>
				<td>FirstName</td>
				<th><input type="text" name="firstName" value="<%= (bean !=null)? bean.getFirst_name():""%>"></th>
			</tr>
			<tr>
				<td>LastName</td>
				<th><input type="text" name="lastName"></th>
			</tr>
			<tr>
				<td>LoginId</td>
				<th><input type="text" name="loginId"></th>
			</tr>
			<tr>
				<td>password</td>
				<th><input type="text" name="password"></th>
			</tr>
			<tr>
				<td>dob</td>
				<th><input type="date" name="dob"></th>
			</tr>
			<tr>
				<td>address</td>
				<th><input type="" name="address"></th>
			</tr>
			<tr>
				<td></td>
				<th><input type="submit" value="<%= (bean!=null)? "save":"update"%>"></th>
			</tr>
			</table>
				<%
					}
				%>
		<%} %>

	</form>



</body>
</html> 