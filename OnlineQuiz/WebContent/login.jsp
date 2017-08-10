<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student-login</title>
<style type="text/css">
body
{
	background-color:black;
	color:white;
	text-align:center;
	font-size:30px;
}
</style>
</head>
<body>
	<h1>Welcome Student!!!</h1>
	<h3>Login</h3>
	<form action="LoginServlet" method="post">
		<label>User Name:</label><input type="text" name="user"><br>
		<label>Password:</label><input type="password" name="pass"><br>
		<input type="submit" value="login" >
		<input type="reset" value="cancel"><br> <br>
		<label>Create a new account</label><br>
		<a href="Signup.jsp">Signup</a>
	</form>

</body>
</html>