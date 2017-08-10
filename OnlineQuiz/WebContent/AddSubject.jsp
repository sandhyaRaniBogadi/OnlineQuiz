<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Subject</title>
</head>
<body>
<h2>Add Subject</h2>
<form action="AddSubjectServlet" method="post">
	<label>Subject Name:</label><input type="text" name="subname"><br>
	<label>Description:</label><input type="text" name="desc"><br>
	<input type="submit" value="ADD">
	<input type="reset" value="CANCEL">
</form>

</body>
</html>