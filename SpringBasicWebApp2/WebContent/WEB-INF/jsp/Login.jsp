<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>

<h2>Welocome to ${compNameObj } :</h2>
	<h3>Login Page</h3>
	<hr color="blue" size="3">
	
	<form:form 
	action="ValidateUser.obj" 
	modelAttribute="login" 
	method="post">
	<table>
	<tr>
		<td>Username: </td>
		<td>
			<form:input path="username"/>
				<form:errors path="username"/> 
		</td>
	</tr>
	<tr>
		<td>Password: </td>
		<td>
			<form:input path="password"/>
				<form:errors path="password"/>
		</td>
	</tr>	
	<tr>
	<td>
		<input type="submit" value="Login">
	</td>
	<td>
		<input type="reset" value="Reset">
	</td>	
</tr>
</table>
</form:form>
	
</body>
</html>