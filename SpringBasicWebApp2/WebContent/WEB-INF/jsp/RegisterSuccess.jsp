
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Successful</title>
</head>
<body>
<h2>${msgObj}</h2><br/>
<table border="1">
	<tr>
		<th>Username</th>
		<th>First Name	</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>SkillSet</th>
		<th>City</th>
		<th>Gender</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
		<c:forEach var="user" items="${userListObj}">
			<tr>
				<td>${user.uname}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td>${user.skillSetStr}</td>
				<td>${user.city}</td>
				<td>${user.gender}</td>
				<td><a href="DeleteUser.obj?uid=${user.uname}">Delete</a></td>
				<td><a href="#">Update</a></td>
			</tr>
	
		</c:forEach>
</table>





<%-- <c:set var="regobj" value="${RegObj}"/>
FirstName:<b> ${regobj.firstName}</b><br/>
LastName:<b> ${regobj.lastName}</b><br/>
Email:<b> ${regobj.email}</b><br/>
SkillSet:<b>${regobj.skillSetStr}</b>
Gender:<b> ${regobj.gender}</b><br/>
City:<b> ${regobj.city}</b><br/> --%>
</body>
</html>