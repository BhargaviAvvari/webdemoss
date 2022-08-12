<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register">
		Enter Name <input type="text" name="name"><br> Enter
		StudentId <input type="text" name="studentId"><br> Enter
		City <input type="text" name="city"><br> 
		Choose Language<select name="language">
			<option value="select">--select---</option>
			<option value="Java">Java</option>
			<option value="Jsp">Jsp</option>
			<option value="Spring">Spring</option>
			<option value="Hibernate">Hibernate</option>
			</select><br>
			Select hobby
		<input type="checkbox" value="music" name="hobby"> music
		<input	type="checkbox" value="dance" name="hobby">dance
		<input type="checkbox" value="sports" name="hobby">sports
		 <input	type="checkbox" value="reading" name="hobby">reading
			<input type="submit" value="register">
			
			
	</form>
</body>
</html>