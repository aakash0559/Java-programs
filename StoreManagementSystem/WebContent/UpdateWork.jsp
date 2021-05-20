<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
	<a href="Home.jsp"><input type="submit" value="Home"
		style="width: 80px; height: 30px"> </a>
	<a href=http://localhost:8080/HtmlWebProject/crud1/Update.jsp><input
		type="submit" value="Back"
		style="width: 80px; height: 30px; float: right"> </a>
	<%
		String EmpId = request.getParameter("EmpId");
		String PhoneNo = request.getParameter("PhoneNo");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/javadb", "root", "");
			PreparedStatement ps = con
					.prepareStatement("update StoreManagement set ContactNumber = ? where EmpId = ?");
			ps.setString(1, PhoneNo);
			ps.setString(2, EmpId);
			ps.executeUpdate();
			con.close();
			out.println("Successfully updated Data in DB");
		} catch (Exception e) {
			System.out.println(e);
		}
	%>

</body> 
</html>