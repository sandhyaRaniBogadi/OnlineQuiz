<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Subject</title>
</head>
<body>
<h2>Delete Subject</h2>
<form action="DeleteSubjectServlet" method="post">
<label>Subject Name:</label>
<input type="text" name="subname"><br>
<input type="submit" value="DELETE">
<input type="reset" value="CANCEL">
</form>

</body>
</html>