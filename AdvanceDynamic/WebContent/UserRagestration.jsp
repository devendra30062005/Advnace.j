
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
	<form action="UserRegistrationCtl" method="post">
		
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
				<%
					if (bean == null) {
				%>
				
		
		<table>
			<tr>
				<td>FirstName</td>
				<th><input type="text" name="firstName"></th>
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
				<th><input type="submit" ></th>
			</tr>
		</table>

	</form>
	<%
					}
				%>

</body>
</html> 