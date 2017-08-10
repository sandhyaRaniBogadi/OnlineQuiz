<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Add New Question</h4>
<form action="AddQuestionServlet" method="get">
<label>Question:</label><br><textarea rows="5" cols="50" name="question"></textarea><br>
<label>Answers:</label><br>
<label>A:</label><input type="text" name="ans1"><br>
<label>B:</label><input type="text" name="ans2"><br>
<label>C:</label><input type="text" name="ans3"><br>
<label>D:</label><input type="text" name="ans4"><br>
<input type="submit" value="OK">
<input type="reset" value="CANCEL">
</form>
</body>
</html>