<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store management</title>
<style type="text/css">
body {
	background-color: #ff4e00;
	background-image: linear-gradient(315deg, #ff4e00 0%, #bdd4e7 0%, #ec9f05 74%);
}

input, select {
	background-color: #eee0f5;
	border: 2px solid black;
	border-radius: 5px;
	width: 200px;
	height: 22px;
	font-size: 14px;
	cursor: pointer;
	color: #22170b;
	margin-top: 3px;
}
</style>
</head>
<body>
	<a href="Home.jsp"><input type="submit" value="Home"
		style="width: 80px; height: 30px;"></a>
	<center>
		<form action="Creatework1.jsp" method="post">

			<h1 style="color: black">Create</h1>
			<table>
				<tr>
					<th>Emp Id:</th>
					<td><input type="number" name="Empid" required></td>
				</tr>
				<tr>
					<th>Shop Name :</th>
					<td><select name="Shopname">
							<option>y claps</option>
							<option>c shell</option>
							<option>l square</option>
							<option>Hero</option>
							<option>Trends fashion</option>
							<option>v clap</option>
							<option>KFC</option>
							<option></option>
					</select></td>
				</tr>
				<tr>
					<th>Name :</th>
					<td><input type="text" name="name" required></td>
				</tr>
				<tr>
					<th>Email :</th>
					<td><input type="text" name="email" required></td>
				</tr>
				<tr>
					<th>Contact Number :</th>
					<td><input type="password" name="Contactnumber" required></td>
				</tr>
				<tr>
					<th>Address:</th>
					<td><input type="text" name="Address" required></td>
				</tr>
				<tr>
					<th>Date of Birth :</th>
					<td><input type="date" name="Dateofbirth" required></td>
				</tr>
				<tr>
					<th>Blood group:</th>
					<td><input type="text" name="Bloodgroup" required></td>
				</tr>
			</table>
			<br> <br> <br> <input type="submit" value="Register"
				style="width: 80px; height: 30px">&emsp; <input type="reset"
				value="Reset" style="width: 80px; height: 30px"> <br>
			<br>
			<marquee direction="right">! Welcome !</marquee>
			<br>
			<br> <br>
			<br>
		</form>
	</center>
</body>
</html>