<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Management</title>
</head>
<body>
	<a href="Home.jsp"><input type="submit" value="Home"
		style="width: 80px; height: 30px"> </a>
<body bgcolor="blue">
	<center>
		<h1>Update</h1>
		<br> <br> <br>

		<form action="UpdateWork.jsp" method="post">
			<table>
				<tr>
					<th>Enter Emp ID To Update:</th>
					<td><input type="text" name="EmpId"></td>
				</tr>


				<tr>
					<th>Phone Number :</th>
					<td><input type="text" name="PhoneNo"></td>
				</tr>

				<tr>
					<th></th>
					<td>&ensp;&emsp;&emsp;<input type="submit" value="Update"
						style="margin-top: 40px;"></td>
				</tr>
			</table>
		</form>
</body>
</html>