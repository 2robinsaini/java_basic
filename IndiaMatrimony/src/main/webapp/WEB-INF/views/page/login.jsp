<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<link rel="shortcut icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<link href="res/css/login.css" rel="stylesheet">
<title>Login</title>
</head>
<body>


    ${msg}
	<div class="container" align="center">
		<form action="<c:url value='/login' />" method='POST'>
			<input type='text' name='username' placeholder="Enter Username"
				value=''> <br> <input type='password'
				placeholder="Enter Password" name='password' /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /><br>
			<%--CSRF hidden field--%>
			<input class="buttonCSS" name="submit" type="submit" value="Login" />
		</form>
		<br>
		<div>
			Not a user?
			<form action="/createUser" method="post">
				<input class="buttonCSS" name="submit" type="submit"
					value="Register Here" />
			</form>
		</div>



	</div>




</body>
</html>