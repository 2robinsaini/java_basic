<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="<c:url value="res/favicon.ico"/>"
	type="image/x-icon" />
<title>All Users</title>
<link href="res/css/tab.css" rel="stylesheet" />
<link href="res/css/custom.css" rel="stylesheet" />
<link href="res/css/custom2.css" rel="stylesheet" />
</head>
<body>

	<div>

		<%-- <table class="tableCustom">

			<tr class="tableRow" style="color: white;">
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
		</table> --%>



		<br> <br>
		
		

		<c:forEach var="usr" items="${userList}">
		
		<%--  <c:set var = "path" scope = "session" value = "file:\\${imagepath} \ ${usr.id}.jpg"/>
		
		<c:set var="path2" value="${fn:replace(path,' ', '')}" />
		
		${path2} --%>
		
			<table class='profile' style="align-content: center;">
				<tr>
					<td><%-- <img src="${path2}" height="200px;" width="400px;" alt="No Image Preview" />
					
					<img src="<c:url value="${path2}"/>"/>
					
					<spring:url value="/resources/images" var="images" />
    <img src="${path2}"/> --%>
					
					<img alt="Image" src="image/${usr.id}" width="150" height="100"/>
					
					</td>
					<td><div>
							<span> <b>Name:</b> ${usr.name} </span> <span><b>Father Name:</b>
								${usr.fatherName}</span> <span><b>Mother Name:</b> ${usr.motherName}</span> <span><b>Gender:</b>
								${usr.gender}</span> <span><b>Date of Birth:</b> ${usr.dob} </span> <span><b>Religion:</b>
								${usr.religion}</span> <span><b>Cast:</b> ${usr.cast}</span> <span><b>Sub
								Cast:</b> ${usr.subCast}</span> <span><b>Gotra:</b> ${usr.gotra}</span>
						</div>
						<div>
							<span><b>Profession:</b> ${usr.profession}</span><span><b>Salary:</b>
								${usr.salary}</span>
						</div>
						<div>
							<span><b>Food Choice:</b> ${usr.foodType} </span> <span><b>Smoker:</b>
								${usr.smoker}</span> <span><b> Drinker: </b> ${usr.smoker}</span>
						</div>
						<div>
							<span> <b> City: </b> ${usr.city}</span> <span><b> State: </b> ${usr.state} </span>
						</div>
						
						</td>
					<td>
					<!-- <form action="showintrest" method="post">
					   <input type="text" name="id" style="display: none;">
					   <input class="submitButton" type="submit" value="Show Interest" onclick="alert('send email.')">	
					   
					   				</form>  -->
					   				<button class='submitButton' onclick="alert('send email.')">Show Intrest</button>
				
					</td>


				</tr>

			</table>











		</c:forEach>



	</div>
</body>
</html>