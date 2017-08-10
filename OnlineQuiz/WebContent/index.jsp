<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
<style type="text/css">
body
{
	background-color:black;
	color:white;
	text-align:center;
	font-size:30px;
	font-style: Lucida Fax;
}
</style>
</head>
<body>
<h1>Online Quiz</h1>
<form action="indexServlet" method="post">
<label> Are you</label><br>
<input type="radio" name="user" value="student"> Student
<input type="radio" name="user" value="teacher"> Teacher<br>
<input type="submit" value="ok">
<input type="reset" value="cancle">
</form>
</body>
</html>