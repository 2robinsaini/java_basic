<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="res/css/custom.css" rel="stylesheet">
<script src="res/css/multiselect-dropdown.js" ></script>
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<a class="smallbutton" href="users">All Matches</a> <br>

		<div style="width: 140px;">
			<form action="filteruser">
				<input class="submitButton" type="submit" value="Apply Filter">
				

				<div class="multiSelect">
				State:<br>
					<select name="state" multiple="multiple">
					
						<c:forEach var="st" items="${State}">
							<option value="<c:out value='${st}' />"><c:out
									value="${st}" /></option>
						</c:forEach>
					</select>
				</div>


				<div class="multiSelect">
				City:<br>
					<select name="city" multiple="multiple" size="1">
						
						<c:forEach var="ct" items="${City}">
							<option value="<c:out value='${ct}' />"><c:out
									value="${ct}" /></option>
						</c:forEach>
					</select>
				</div>


				<div class="multiSelect">
				Profession:<br>
					<select name="profession" multiple="multiple" size="1">
						
						<c:forEach var="pf" items="${Profession}">
							<option value="<c:out value='${pf}' />"><c:out
									value="${pf}" /></option>
						</c:forEach>
					</select>
				</div>


				<div class="multiSelect">
				Salary:<br>
					<select name="salary" multiple="multiple" size="1">
						
						<c:forEach var="sl" items="${Salary}">
							<option value="<c:out value='${sl}' />"><c:out
									value="${sl}" /></option>
						</c:forEach>
					</select>
				</div>

				<div class="multiSelect">
				Gotra:<br>
					<select name="gotra" multiple="multiple" size="1">
					
						<c:forEach var="gtr" items="${Gotra}">
							<option value="<c:out value='${gtr}' />"><c:out
									value="${gtr}" /></option>
						</c:forEach>
					</select>
				</div>

				<div class="multiSelect">
				Food Type:<br>
					<select name="foodtype" multiple="multiple" size="1">
						<c:forEach var="ft" items="${FoodType}">
							<option value="<c:out value='${ft}' />"><c:out
									value="${ft}" /></option>
						</c:forEach>
					</select>
				</div>

				<div class="multiSelect">
				Relegion:<br>
					<select name="religion" multiple="multiple" size="1">
						<c:forEach var="rl" items="${Religion}">
							<option value="<c:out value='${rl}' />"><c:out
									value="${rl}" /></option>
						</c:forEach>
					</select>
				</div>

				<div class="multiSelect">
				Cast:<br>
					<select name="cast" multiple="multiple" size="1">
						<c:forEach var="cst" items="${Cast}">
							<option value="<c:out value='${cst}' />"><c:out
									value="${cst}" /></option>
						</c:forEach>
					</select>
				</div>


			</form>

		</div>







	</div>


</body>
</html>