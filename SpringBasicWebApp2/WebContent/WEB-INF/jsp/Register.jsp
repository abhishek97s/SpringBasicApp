<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h3>Give Your Registration Details</h3>
<form:form 
	action="RegisterSuccess.obj" 
	modelAttribute="reg"
	method="post">
	<table>
	<tr>
		<td>First Name: </td>
		<td>
			<form:input path="firstName"/><form:errors path="firstName"/>
		</td>
	</tr>
	
	<tr>
		<td>Last Name: </td>
		<td>
			<form:input path="lastName"/>
		</td>
	</tr>	
	<tr>
		<td>Gender: </td>
		<td>
			<form:radiobutton path="gender" value="F" label="Female"/>
			<form:radiobutton path="gender" value="M" label="Male"/>
		</td>
	</tr>	
	<tr>
		<td>Email: </td>
		<td>
			<form:input path="email"/><form:errors path="email"/>
		</td>
	</tr>
	<tr>
		<td>SkillSet: </td>
		<td>
			<form:checkboxes items="${skillSet}" path="skillSet" />
		</td>
	</tr>
	<tr>
		<td>City: </td>
		<td>
		<form:select path="city">
			<form:option value="Select City"/>
			<form:options items="${cityList}"/>
		</form:select>
	
		</td>
	</tr>
	<tr>
	<td>
		<input type="submit" value="register" name="regBtn">
	</td>
	<td>
		<input type="reset" value="Reset">
	</td>	
</tr>
</table>
</form:form>
</body>
</html>