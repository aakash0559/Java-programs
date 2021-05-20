<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<a href="Home.jsp"><input type="submit" value="Home"
	style="width: 80px; height: 30px"> </a>
<a href=http://localhost:8080/HtmlWebProject/crud1/Delete.jsp><input
	type="submit" value="Back"
	style="width: 80px; height: 30px; float: right"> </a>
<body>
	<%
		int EmpId = Integer.parseInt(request.getParameter("EmpId"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
			PreparedStatement ps = con.prepareStatement("delete from StoreManagement where EmpId = ?");
			ps.setInt(1, EmpId);
			ps.executeUpdate();
			con.close();
			out.println("Successfully deleted Data in DB");
		} catch (Exception e) {
			System.out.println(e);
		}
	%>
</body>
</html>