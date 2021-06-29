<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<link rel="stylesheet" href="res/css/jquery-ui.css">
<script src="res/css/jquery-1.12.4.js"></script>
<script src="res/css/jquery-ui.js"></script>
<link rel="stylesheet" href="res/css/custom2.css">
<link rel="stylesheet" href="res/css/custom.css">

<script>
	$(function() {
		$('#datepicker1').datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();
	});

	$(function() {
		$('#datepicker2').datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();

	});
</script>


</head>
<body>
	<div align="center">
		Profile Update<br> ${message}

		<table >
			<tr>
				<td style="width: 30%;" align="center">

					<form method="POST" action="/upload" enctype="multipart/form-data" class='profile'>
						<input type="text" name="userid" value="${sessionScope.userid}"
							style="display: none;"> <br /> <input type="file"
							name="file" /><br /> <br /> <input class='submitButton' type="submit"
							value="Upload Picture" />
					</form>


				</td>
				<td style="width: 70%;" align="left">
					<!-- <div align="center"> --> <form:form id="usrenrollment"
						name="usrenrollment" method="post" modelAttribute="user"
						action="/updateUser">

						<spring:bind path="user.id">
							<input id="userid" type="text" name="${status.expression}"
								value="${status.value}" placeholder="ID" readonly="readonly">
							<br />
						</spring:bind>

						<spring:bind path="user.email">
							<input type="text" name="${status.expression}"
								value="${status.value}" placeholder="Email" readonly="readonly">
							<br />
						</spring:bind>

						<spring:bind path="user.password">
							<input type="text" name="${status.expression}"
								value="${status.value}" placeholder="Pass" readonly="readonly"
								style="display: none;">
							<br />
						</spring:bind>

						<spring:bind path="user.name">
							<input type="text" name="${status.expression}"
								value="${status.value}" placeholder="Name">
							<br />
						</spring:bind>

						<spring:bind path="user.fatherName">
							<input type="text" name="${status.expression}"
								placeholder="Father name" value="${status.value}">
							<br />
						</spring:bind>


						<spring:bind path="user.motherName">
							<input type="text" name="${status.expression}"
								placeholder="Mother name" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.gender">
							<input type="text" name="${status.expression}"
								placeholder="gender" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.profession">
							<input type="text" name="${status.expression}"
								placeholder="profession" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.salary">
							<input type="text" name="${status.expression}"
								placeholder="salary" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.dob">
							<input type="text" id="datepicker1" name="${status.expression}"
								placeholder="User DOB" value="${status.value}">
							<br />
						</spring:bind>


						<spring:bind path="user.gotra">
							<input type="text" name="${status.expression}"
								placeholder="gotra" value="${status.value}">
							<br />
						</spring:bind>


						<spring:bind path="user.foodType">
							<input type="text" name="${status.expression}"
								placeholder="Food Type" value="${status.value}">
							<br />
						</spring:bind>


						<spring:bind path="user.smoker">
							<input type="text" name="${status.expression}"
								placeholder="Smoker" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.drinker">
							<input type="text" name="${status.expression}"
								placeholder="drinker" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.religion">
							<input type="text" name="${status.expression}"
								placeholder="Religion" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.cast">
							<input type="text" name="${status.expression}" placeholder="cast"
								value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.subCast">
							<input type="text" name="${status.expression}"
								placeholder="Sub Cast" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.state">
							<input type="text" name="${status.expression}"
								placeholder="State" value="${status.value}">
							<br />
						</spring:bind>

						<spring:bind path="user.city">
							<input type="text" name="${status.expression}" placeholder="City"
								value="${status.value}">
							<br />
						</spring:bind>


						<input class="submitButton" type="submit" value="Update" />
					</form:form> <!-- </div> -->

				</td>

			</tr>
		</table>

	</div>







</body>
</html>