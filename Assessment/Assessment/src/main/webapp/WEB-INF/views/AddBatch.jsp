<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css2?family=Lato:wght@300;400&display=swap" rel="stylesheet">
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
     
     <script type="text/javascript">
     
     function validate()
     {
    	 var batchdesv=document.getElementById("batchdesc1");
    	 
    	 if(notEmpty(batchdesv,"Batch Description Must Not Empty!!s"))
    	 { 
    		 return true;
    	 }
    	 return false;
     }  
     
     function notEmpty(elem,msg)
     {
     if(elem.value.length==0)
     {
     alert(msg);
     elem.focus();
     return false;
     }
     return true;
     }
     </script>
        
    <style type="text/css">
    	body{
    		background: #e0e0e0;
    		font-family: Lato;
    	}
    	.container{
    		font-family:Lato;
    		padding:40px;
    		margin-top:10px;
    		height:600px;
    		width:400px;
    		border-radius: 18px;
			background: #e0e0e0;
			box-shadow:  5px 5px 8px #9b9b9b,
			             -5px -5px 8px #ffffff;
    	}
    	.form-group input{
    		/*border-color:black;*/
		    background: none;
		    color: rgb(0, 0, 0);
		    font-family:Lato;
		}
    	.a{ 
    		color: black;
    	}
    	.b{
    		margin-bottom: 20px;
    		margin-left: 100px;
    		font-size: 25px;;
    		font-weight: bold;
    		color: black;
    	}
    	.copy{
    		margin-left: 100px;
    		margin-top: 100px;
    		color: black;
    	}
    	.b1{
    		margin-left:60px;
    		float:left;
    	}
    	.b2{
    		float:left;
    		margin-left: 20px;
    	}
    </style>
<title>Home</title>
</head>
<body>


	<form:form onsubmit="return validate()" action="${pageContext.request.contextPath}/AddBatch" method="post" modelAttribute="addbatch">
	
		<div class="container">
			<div class="b">Add Batch</div>
			
			<div class="form-group">
			    <label class="a">Batch Description</label>
			    <form:input class="form-control" path="batchdesc" id="batchdesc1"  placeholder="Type Here.."/>
		<!-- 	    <div class="invalid-feedback" id="usernm_valid">Please enter a username.</div> -->
			    <!-- <div id="usercheck" style="color: red;" >Batch Desc. Must Filled in.</div> -->
			</div>
			
			<div class="form-group">
			    <label class="a">Start Time</label>
			    <form:input class="form-control" id="starttime" type="time" path="starttime" placeholder="Type Here.."/>
			</div>
			
			<div class="form-group">
			    <label class="a">End Time</label>
			    <form:input class="form-control" id="endtime" type="time" path="endtime"/>
			</div>
			
			<div class="form-group">
			    <label class="a">Start Date</label>
			    <form:input class="form-control" id="starttime" type="date" path="startdate"/>
			</div>
			
			<div class="form-group">
			    <label class="a">End Date</label>
			    <form:input class="form-control" id="endtime" type="date" path="enddate"/>
			</div><div><form:hidden path = "batchid"/></div>
			
			
			<div>
				<div class="b1"><button id="reg_btn" class="btn btn-primary" type="submit" >Add Batch</button></div>
				<div class="b2"><button class="btn btn-secondary" type="reset">Reset</button></div>
			</div>
			
			
			<form:hidden path = "batchid"/>
			<div class="copy">@Copyright CSM</div>
			
		</div>		
		
	</form:form>
	
</body>
</html>