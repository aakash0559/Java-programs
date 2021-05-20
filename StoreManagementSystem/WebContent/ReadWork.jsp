<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td, th {
	padding: 8px;
}
</style>
</head>
<body
	style="background-color: #eec0c6; background-image: linear-gradient(315deg, #eec0c6 0%, #7ee8fa 74%);">
	<a href="Read.jsp"><input type="submit" value="Back"
		style="width: 80px; height: 30px; float: right"> </a>
	<a href="Home.jsp"><input type="submit" value="Home"
		style="width: 80px; height: 30px"> </a>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<table border="3"
			style="border-collapse: collapse; width: 300px; height: 400px;">
			<%
				int EmpId = Integer.parseInt(request.getParameter("EmpId"));
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
					PreparedStatement ps = con.prepareStatement("select * from StoreManagement where EmpId = ?");
					ps.setInt(1, EmpId);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						out.println("<tr><th>Emp Id</th><td>" + rs.getString(1) + "</td></tr>"
								+ "<tr><th>Shop Name</th><td> " + rs.getString(2) + "</td></tr>" + "<tr><th>Name</th><td> "
								+ rs.getString(3) + "</td></tr>" + "<tr><th>Email Id </th><td> " + rs.getString(4)
								+ "</td></tr>" + "<tr><th>Contact Number</th><td> " + rs.getString(5) + "</td></tr>"
								+ "<tr><th>Address</th><td> " + rs.getString(6) + "</td></tr>"
								+ "<tr><th>Date Of Birth</th><td> " + rs.getString(7) + "</td></tr>"
								+ "<tr><th>EmpId</th><td>" + rs.getString(8) + "</td></tr>");
					}
					con.close();
				} catch (Exception e) {
					System.out.print(e);
				}
			%>
		</table>
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
		<br>
		<br>
		<br>
		<br>
	</center>
	<br>
	<br>
</body>
</html>