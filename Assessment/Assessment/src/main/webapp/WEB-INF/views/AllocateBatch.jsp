<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400&display=swap" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    	body{
    		background: #e0e0e0;
    		font-family: Lato;
    	}
    	.container{
    		font-family:Lato;
    		padding-left:80px;
    		margin-top:20px;
    		height:600px;
    		width:400px;
    		border-radius: 18px;
			background: #e0e0e0;
			box-shadow:  5px 5px 8px #9b9b9b,
			             -5px -5px 8px #ffffff;
    	}
    	.form-group select{
    		/*border-color:black;*/
		    background: none;
		    font-family:Lato;
		    color: rgb(0, 0, 0);
		}
    	.a{ 
    		color: black;
    	}
    	.b{
    		margin-top:30px;
    		margin-bottom: 20px;
    		margin-left: 40px;
    		font-size: 25px;;
    		font-weight: bold;
    		color: black;
    	}
    	.copy{
    		margin-left: 60px;
    		margin-top: 100px;
    		color: black;
    	}
    	.b1{
    		margin-left:30px;
    		float:left;
    	}
    	.b2{
    		float:left;
    		margin-left: 10px;
    	}
    	.drp1{
    		margin-top: 40px;
    	}
    	.drp2{
    		margin-bottom: 30px;
    	}
    </style>
</head>
<body>
	<form:form action="AllocateBatch" method="post" modelAttribute="allocatebatch">
		<div class="container">
			<div class="b">Allocate Batch</div>
			
			<div class="form-group drp1">
			    <label class="a">Select Student </label>
			    
			    
			    
			    	<form:select path="regno">
			    		<c:forEach items="${list}" var="e">
							<form:option value="${e.regno}">${e.studentname}</form:option>
						</c:forEach>
					</form:select>
			</div>
			
			<div class="form-group drp2">
			    <label class="a">Select Batch </label>  
			    <form:select path="batchid">
			    		<c:forEach items="${list1}" var="f">
							<form:option value="${f.batchid}">${f.batchdesc}</form:option>
						</c:forEach>
					</form:select>
			</div><form:hidden path = "slno"/>
			
			<div>
				<div class="b1"><button class="btn btn-primary" type="submit" >AllocateBtach</button></div>
				<div class="b2"><button class="btn btn-secondary" type="reset">Reset</button></div>
			</div>
			
			
			<div class="copy">@Copyright CSM</div>
			
		</div>		
	</form:form>	
</body>
</html>