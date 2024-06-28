
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
		<h1>User Table Record</h1>
		<a href="ahomepage">Back To Home</a> 
		<br>
		<br>
		
		<form action="savedata" method="post">
<center>
			Name <input type="text" name="name"> <br><br>
			Email <input type="email" name="email"> <br><br>
			Mobile <input type="mobile" name="mobile"> <br><br>
		Password <input type="password" name="password"> <br><br>
			Re-PassWord <input type="password" name="repassword"> 
				
				<br>
				<br></center>
				<input type="submit" value="save">

			<input type="submit" value="update" formaction="updatedata">
			<input type="submit" value="delete" formaction="deletedata">

			<input type="reset" value="reset">

		</form>
		
		<form action="deletedata" method="post">
		<input type="submit" value="delete">
		
		</form>
		
		</form>
		
		<form action="updatedata" method="post">
		<input type="submit" value="update">
		
		</form>
		
		
		<br>
	</center>



<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Password</th>
<th>Re-Password</th>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/companyproject", "root", "root");
PreparedStatement ps =connection.prepareStatement("select * from create_account");
ResultSet rs=ps.executeQuery();
while(rs.next()){
	out.println("<tr> <td>"+ rs.getString(3) + "</td> <td>"+ rs.getString(1) + "</td>  <td>"+ rs.getString(2) + "</td>  <td>"+ rs.getString(4) + "</td>  <td>"+ rs.getString(5) + "</td> </tr>" );
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