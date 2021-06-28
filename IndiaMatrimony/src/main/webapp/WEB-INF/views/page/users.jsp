<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<title>All Users</title>
<link href="res/css/tab.css" rel="stylesheet" />
<link href="res/css/custom.css" rel="stylesheet" />
</head>
<body>

	<div>

		<table class="tableCustom">

			<tr class="tableRow" style="color:white;">
				<th class="tableCustom">User ID</th>
				<th class="tableCustom">Name</th>
				<th class="tableCustom">Father Name</th>
				<th class="tableCustom">Mother Name</th>
				<th class="tableCustom">Gender</th>
				<th class="tableCustom">Profession</th>
				<th class="tableCustom">Salary</th>
				<th class="tableCustom">DOB</th>
				<th class="tableCustom">Gotra</th>
				<th class="tableCustom">Food Type</th>
				<th class="tableCustom">Smoker</th>
				<th class="tableCustom">Drinker</th>
				<th class="tableCustom">Religion</th>
				<th class="tableCustom">Cast</th>
				<th class="tableCustom">Sub Cast</th>
				<th class="tableCustom">State</th>
				<th class="tableCustom">City</th>

			</tr>


			<c:forEach var="usr" items="${userList}">
				<tr>
					<td class="tableCustom"><c:out value="${usr.id}" /></td>
					<td class="tableCustom"><c:out value="${usr.name}" /></td>
					<td class="tableCustom"><c:out value="${usr.fatherName}" /></td>
					<td class="tableCustom"><c:out value="${usr.motherName}" /></td>
					<td class="tableCustom"><c:out value="${usr.gender}" /></td>
					<td class="tableCustom"><c:out value="${usr.profession}" /></td>
					<td class="tableCustom"><c:out value="${usr.salary}" /></td>
					<td class="tableCustom"><c:out value="${usr.dob}" /></td>
					<td class="tableCustom"><c:out value="${usr.gotra}" /></td>


					<td class="tableCustom"><c:out value="${usr.foodType}" /></td>
					<td class="tableCustom"><c:out value="${usr.smoker}" /></td>
					<td class="tableCustom"><c:out value="${usr.drinker}" /></td>
					<td class="tableCustom"><c:out value="${usr.religion}" /></td>
					<td class="tableCustom"><c:out value="${usr.cast}" /></td>
					<td class="tableCustom"><c:out value="${usr.subCast}" /></td>
					<td class="tableCustom"><c:out value="${usr.state}" /></td>
					<td class="tableCustom"><c:out value="${usr.city}" /></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>