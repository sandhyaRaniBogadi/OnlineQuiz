<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student signup</title>
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
<h3>Tacher-Signup</h3>
<form action="T_SignupServlet" method="post">
	<label>User Name:</label><input type="text" name="user"><br>
	<label>Password:</label><input type="password" name="pass"><br>
	<label>Phone Number:</label><input type="text" name="phno"><br>
	<label>Email</label><input type="text" name="email"><br>
	<label>DOB:</label><input type="date" name="dob"><br>
	<input type="submit" value="signin">
	<input type="reset" value="cancel">
</form>

</body>
</html>