<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	float: right;
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

.topnav-right {
	float: right;
}
</style>
</head>
<body>

	<div class="topnav">
		<i>Pet Shop</i>   <a href="/petPeers/login">Login</a>


	</div>
	<br>

	<div style="padding-left: 100px">
		<strong>Register</strong> <br> <br>
		<form:form method="post" action="saveUser" modelAttribute="user">
			<table>

				<tr>
					<td>Name :</td>


				</tr>

				<tr>
					<td><form:input path="userName" size="75" /></td>
					<td><font color="red"><form:errors path="userName" /></font></td>
				</tr>
				<tr>
					<td><br></td>
				<tr>
				<tr>
					<td>Password :</td>

				</tr>
				<tr>
					<td><form:input path="userPassword" size="75" type="password" /></td>
					<td><font color="red"><form:errors path="userPassword" /></font><td>
				</tr>
				<tr>
					<td><br></td>
				<tr>
				<tr>
					<td>Confirm Password :</td>

				</tr>
				<tr>
					<td><br></td>
				<tr>
				<tr>
					<td><form:input path="confirmPassword" size="75" type="password" /></td>
					<td><font color="red"><form:errors path="confirmPassword" /></font></td>
				</tr>


			</table>
			<br>
			<input style="background-color: #89CFF0;" type="submit"
				value="Register">
		</form:form>
	</div>

</body>
</html>
