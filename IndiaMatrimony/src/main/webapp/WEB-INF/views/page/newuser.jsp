<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link href="res/css/tab.css" rel="stylesheet" /> -->
<link rel="icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<link href="res/css/custom.css" rel="stylesheet" />
</head>
<body>

	<div align="center" style="padding: 10px;margin:2px; border: 1px;" >
		<table style="padding: 20px; margin: 10px;">
			<form:form id="usrenrollment" name="usrenrollment" method="post"
				modelAttribute="user" action="addNewUsr">


				<spring:bind path="user.name">
					<input type="text" name="${status.expression}"
						value="${status.value}" placeholder="Name">
					<br />
				</spring:bind>


				<spring:bind path="user.email">
					<input type="text" name="${status.expression}"
						value="${status.value}" placeholder="Email ID">
					<br />
				</spring:bind>

				<spring:bind path="user.gender">

					<select name="${status.expression}">
						<option value="Male">Male</option>
						<option value="FeMale">FeMale</option>
					</select>

					<br />
				</spring:bind>


				<spring:bind path="user.password">
					<input type="password" name="${status.expression}"
						placeholder="Password" value="${status.value}">
					<br />
				</spring:bind>


				<spring:bind path="user.password2">
					<input type="password" name="${status.expression}"
						placeholder="Re-enter Password" value="${status.value}">
					<br />
				</spring:bind>

				<input class="submitButton" type="submit" value="Register" />

			</form:form>


		</table>

	</div>

</body>
</html>