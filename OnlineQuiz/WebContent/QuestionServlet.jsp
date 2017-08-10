<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Questions</h2>
<%
String x=request.getParameter("sub");
%>
<form action="QuestionServlet" method="post">
<input type="text" value="<%= x %>" name="s1">
<input type="submit" value="AddQuestion" name="ques">
<input type="submit" value="DeleteQuestion" name="ques">
<input type="submit" value="ViewQuestion" name="ques">
</form>
</body>
</html>