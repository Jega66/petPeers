<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}


.topnav {
	overflow: hidden;
	background-color: #001400;
}

.topnav i {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #04AA6D;
	color: white;
}

td {
	padding: 15px;
	border: 1px solid;
	border-bottom: 1px solid #ddd;
}

table {
	width: 47%;
	border-collapse: collapse;
}

tr {
	border: 1px solid;
	color: black;
	border-bottom: 1px solid #ddd;
	height: 50px;
}

th {
	border: 1px solid;
	background-color:brown;
	color: black;
	border-bottom: 1px solid #ddd;
	height: 50px;
}


tr:nth-child(even) {
	background-color: #f2f2f2;
}

.topnav-right {
	float: right;
}
</style>
</head>
<body>


	<div class="topnav">
		<i>Pet Shop</i> <a href="<c:url value = "/Home"/>">Home</a>
		<a href="<c:url value = "/myPets"/>">Mypet</a> 
		
		<a class="active" href="<c:url value = "/toAddPet"/>">AddPet</a>

		<div class="topnav-right">

			<a href="<c:url value = "/logout"/>">Logout</a>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<div style="padding-left:500px">
	
		<form:form action="savePet" method="post" modelAttribute="pet">
			
			<table>
				<tr><td style="background-color:#003300;color:white;border: 1px solid;" colspan="2"> pet Information</td></tr>
				<tr>
					<td>Name:</td>
					<td><form:input type="text" path="petName" /></td>
					
					
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input type="text" path="petAge" /></td>
					
					
				</tr>
				<tr>
					<td>Place:</td>
					<td><form:input type="text" path="petPlace" /></td>
					
					
				</tr>
				<tr>
				<td style="border:none;"><input style="background-color: #89CFF0;" type="submit" value="AddPet" /></td>
				<td style="border:none;"><input type="button" onclick="/AddPet/${user.userId}" value="Cancel" /></td>
				</tr>
			</table>
			
		</form:form>

	</div>

</body>
</html>
