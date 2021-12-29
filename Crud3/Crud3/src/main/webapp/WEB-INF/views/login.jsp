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
				<td colspan="2"><center>Login Here</center><br></td>
			</tr>
		</thead>
		<tbody>
			<form:form action="Login" method="post" modelAttribute="empBean">
				<tr>
					<td>UserName:</td>
					<td><form:input path="empuname"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="emppass"/></td>
				</tr>
				<tr>
					<td>Department:</td>
					<td><form:input path="empdept"/></td>
				</tr>
				<tr>
					<td>&emsp;&emsp;&emsp;<button>Login</button></td>
					<td>&emsp;&emsp;<button type="reset">Reset</button></td>
				</tr>
			</form:form>
		</tbody>
		<tfoot>
			<tr>
				<td><center>New User: </center></td>
				<td><a href = "${pageContext.request.contextPath}/Register">Register Here</a></td>
			</tr>
		</tfoot>
	</table>
	
</body>
</html>