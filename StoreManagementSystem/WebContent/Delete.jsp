<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Management</title>
<script>
	function myFunction() {
		var txt;
		if (confirm("Press a button!")) {
			txt = "You pressed OK!";
		} else {

			txt = "You pressed Cancel!";
		}
		document.getElementById("demo").innerHTML = txt;
	}
</script>

</head>
<a href="Home.jsp"><input type="submit" value="Home"
	style="width: 80px; height: 30px"> </a>
<a href=http://localhost:8080/HtmlWebProject/crud1/Home.jsp><input
	type="submit" value="Back"
	style="width: 80px; height: 30px; float: right"> </a>
<body>
<body bgcolor="pink">
	<center>
		<h1>Delete</h1>
		<br> <br> <br>
		<form action="DeleteWork.jsp" method="post">
			Enter EmpID to delete: <input type="text" name="EmpId"><br>
			<br>
			<br>
			<br>
			<button onclick="myFunction()">Delete</button>

			<p id="demo"></p>

		</form>
</body>
</html>