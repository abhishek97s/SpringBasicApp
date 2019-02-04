
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
<h2>Data is inserted</h2><br/>
<hr/>
<c:set var="regobj" value="${RegObj}"/>
FirstName:<b> ${regobj.firstName}</b><br/>
LastName:<b> ${regobj.lastName}</b><br/>
Email:<b> ${regobj.email}</b><br/>
SkillSet:<b>
<c:forEach var="skillSet" items="${regobj.skillSet}">
    ${ skillSet}
    </c:forEach>
</b><br/>
Gender:<b> ${regobj.gender}</b><br/>
City:<b> ${regobj.city}</b><br/>
</body>
</html>