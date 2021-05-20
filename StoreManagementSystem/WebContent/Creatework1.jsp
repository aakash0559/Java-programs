<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Management</title>
<style type="text/css">
div {
	color: black;
	font-size: 26px;
	background-color: #63d471;
}
</style>
</head>
<body bgcolor="#63d471">
	<a href="Home.jsp"><input type="submit" value="Home"
		style="width: 80px; height: 30px"> </a>
	<a href=http://localhost:8080/HtmlWebProject/crud1/Create.jsp><input
		type="submit" value="Back"
		style="width: 80px; height: 30px; float: right"> </a>
	<center>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<%
			int EmpId = Integer.parseInt(request.getParameter("Empid"));
			String Shopname = request.getParameter("Shopname");
			String Name = request.getParameter("name");
			String Email = request.getParameter("email");
			String ContactNumber = request.getParameter("Contactnumber");
			String Address = request.getParameter("Address");
			String Dateofbirth = request.getParameter("Dateofbirth");
			String Bloodgroup = request.getParameter("Bloodgroup");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
				PreparedStatement ps = con.prepareStatement("insert into StoreManagement values (?,?,?,?,?,?,?,?)");
				ps.setInt(1, EmpId);
				ps.setString(2, Shopname);
				ps.setString(3, Name);
				ps.setString(4, Email);
				ps.setString(5, ContactNumber);
				ps.setString(6, Address);
				ps.setString(7, Dateofbirth);
				ps.setString(8, Bloodgroup);
				ps.executeUpdate();
				con.close();
				out.println("<div>Successfully inserted Data into DB </div>");
			} catch (Exception e) {
				System.out.println(e);
			}
		%>
	</center>
</body>
</html>