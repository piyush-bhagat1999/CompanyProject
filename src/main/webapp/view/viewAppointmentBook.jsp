<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<meta charset="utf-8">
     <title>Piyush Bhagat - Mico Hospital System</title>
   
    <!-- Favicon -->
    <link rel="icon" href="img/tka.jpg">
</head>
<body>

<center>
		<h1>Patient Appointment Table Record</h1>
		<a href="ahomepage">Back To Home</a> 
		<br>
		<br>
		
		<form action="savedata" method="post">

			PatientName <input type="text" name="id"> PassWord <input type="password"
				name="name"> 
				<br>
				<br>
				<input type="submit" value="save">

			<button type="button" formaction="update">Update</button>
			<button type="button" formaction="delete">Delete</button>

			<input type="reset" value="reset">

		</form>
		<br>
	</center>



<table>

<tr>
<th>Patient Name</th>
<th>Doctor Name</th>
<th>Phone</th>
<th>Symptoms</th>
<th>Date</th>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/companyproject", "root", "root");
PreparedStatement ps =connection.prepareStatement("select * from booking_info");
ResultSet rs=ps.executeQuery();
while(rs.next()){
	out.println("<tr><td>" + rs.getString(4) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(1) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(2) + "</td></tr>");
}


%>

</table>


<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>




</body>
</html>