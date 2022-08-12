<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String username=(String)request.getAttribute("username");
out.print("Welcome "+username+"<br>");
%>
<form action="movieServlet">
Choose Language<select name="language">
<option value="select">---select---</option>
<option value="Telugu">Telugu</option>
<option value="Hindi">Hindi</option>
<option value="English">English</option>
<option value="Tamil">Tamil</option>
</select><br>
<input type="submit">
</form>
</body>
</html>