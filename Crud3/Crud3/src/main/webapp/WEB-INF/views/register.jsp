<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<title>Home</title>
</head>
<body>
	
	<table align="center">
		<thead>
			<tr>
				<td colspan="2"><center>Registrtion Here</center></td>
			</tr>
		</thead>
		<tbody>
			<form:form action="Register" method="post" modelAttribute="empBean">
				<tr>
					<td>UserName:</td>
					<td><form:input path="empuname"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="emppass"/></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input path="empfname"/></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="emplname"/></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="empemail"/></td>
				</tr>
				<tr>
					<td>Date of Birth:</td>
					<td><form:input type="date" path="empdob"/></td>
				</tr>
				<tr>
					<td>Department:</td>
					<td><form:input path="empdept"/></td>
				</tr>
				<tr>
					<td><center><button >Register</button></center></td>
					<td><center><button type="reset">Reset</button></center></td>
				</tr>
			</form:form>
		</tbody>
		<tfoot>
			<tr>
				<td>Already a User: </td>
				<td>&emsp;&emsp;<a href = "${pageContext.request.contextPath}/Login">Login</a></td>
			</tr>
		</tfoot>
	</table>
	
</body>
</html>