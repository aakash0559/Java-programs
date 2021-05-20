<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<a href="Home.jsp"><input type="submit" value="Home"
	style="width: 80px; height: 30px"> </a>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	style="background-color: #bdd4e7; background-image: linear-gradient(315deg, #bdd4e7 0%, #8693ab 74%)";>

	<center>
		<h1 style="margin-left: 20px; font-size: 60px; color: red">
			<b> Read</b>
		</h1>
		<br>
		<br>
		<br>
		<form action="ReadWork.jsp" method="post">
			<input type="text" name="EmpId" placeholder="Enter Emp ID To Search"
				required><br>
			<br>
			<br>
			<br> <input type="submit" value="Search"
				style="margin-left: 10px; width: 60px">
		</form>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</center>
</body>
</html>