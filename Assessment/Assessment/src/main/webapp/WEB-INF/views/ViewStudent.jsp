<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400&display=swap" rel="stylesheet">

<link href="https://cdn.datatables.net/1.11.3/css/dataTables.bootstrap4.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css" rel="stylesheet">
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"> </script>  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"> </script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"> </script>  
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css">   
  <script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"> </script>  
   <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" > 
   
   
	<style type="text/css">
body {  
font-size: 15px;
font-family:Lato;
 margin-left: 150px;
 margin-right: 150px;
} 
	</style>
	<script>
	$(document).ready(function() {
	    $('#mytable').DataTable();
	} );
  </script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">List of Student</h1>
	<table border = "0" align="center" id="mytable" class="table table-striped table-bordered">
	
	
		<thead>
					<tr>
			<th>Reg No</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
			
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="e">
			<tr>
				<td>${e.regno}</td>
				<td>${e.studentname}</td>
				<td>${e.studentphn}</td>
				<td>${e.studentemail}</td>
				<td>
					<a href = "/edit1/${e.regno}"><span class="glyphicon glyphicon-edit"></span></a>
					|
					<a href = "/delete1/${e.regno}"><span class="glyphicon glyphicon-trash"></span></a>
				</td>
				
			</tr>
		</c:forEach>
		</tbody>
		
		
		<tfoot>
			<tr>
				<td colspan="7"><center><button class="btn btn-info btn-lg" onclick="window.location.href='${pageContext.request.contextPath}/Home'"><span class="glyphicon glyphicon-home"></span>  Home</button></center></td>
			</tr>
		</tfoot>
		
	</table>
	
</body>
</html>