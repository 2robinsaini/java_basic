<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="res/css/custom.css">
</head>
<body>

	<div
		style="background-image: url('res/image/footer.jpg'); opacity: 0.7; border-bottom: 1px;">
		<table>
			<tr style="width: 100%; border-bottom: 1px;" align="center">
				<td style="align: left; width: 5%;"><a href="home"> <img
						src="res/image/home.png" height="60px;" width="100px;"></a></td>
				<td style="width: 85%; color: white;"><h3>Welcome to the
						India Matrimony</h3></td>
				<td style="width: 10%;"><c:url value="/logout" var="logoutUrl" />



					<c:if test="${fn:contains(sessionScope.signinuser, '@')}">
						<div style="color: white;" align="right">
							Hi,
							<c:out value="${sessionScope.signinuser}" />
						</div>
						<br>


						<table>
							<tr>
								<td>

									<form action="/update" method="post">
										<input type="text" value="${sessionScope.signinuser}"
											name="email" style="display: none;"> <input
											class="submitButton" type="submit" value="Update Profile">
									</form> 

								</td>
								<td>
								
								
								<form action="/signout" method="post">
										<input type="text" value="${sessionScope.signinuser}"
											name="email" style="display: none;"> <input
											class="submitButton" type="submit" value="Sign-Out">
									</form> 
								
								
								
								<%-- <a class="smallbutton"
									href="/signout?user=<c:out value='${sessionScope.signinuser}'/>">Sign-Out</a> --%></td>

							</tr>
						</table>

					</c:if>

					<form action="${logoutUrl}" method="post" id="logout">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form> <c:choose>
						<c:when test="${pageContext.request.userPrincipal.name != null}">

							<a class="button"
								href="javascript:document.getElementById('logout').submit()">Logout!</a>
						</c:when>
						<c:otherwise>
							<c:if test="${username !=null }">
								<a class="button"
									href="javascript:document.getElementById('logout').submit()">Logout</a>
							</c:if>
						</c:otherwise>


					</c:choose></td>
			</tr>
		</table>

	</div>

</body>
</html>