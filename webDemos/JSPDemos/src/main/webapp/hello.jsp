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
out.println("have a great day");
%>
<%!String name="Ram";%>
<%= "Welcome"+name  %>
<%int x=10,y=20;%>
<%="Sum "+(x+y) %>
<%!int count=0; %>
your visitor number<%= ++count%>
<%! String greet(){
	return "Welcome back";
}
%>
<%=greet() %>
</body>
</html>