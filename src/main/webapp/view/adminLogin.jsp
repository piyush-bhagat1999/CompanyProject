<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink">

<center>
<form action="adminData" method="post">
<h1>Admin Login</h1>
<h3 style="color: red"><%

if(request.getAttribute("msg")!=null){
	out.print(request.getAttribute("msg"));
}
%></h3>
<b  style="margin-right: 6%">Enter email</b><br>
<input type="email"  name="email" placeholder="Enter Email"><br><br>
<b  style="margin-right: 4%">Enter password</b><br>
<input type="password"  name="password"  placeholder="Password"><br><br>
<input type="submit" value="Sign In"><br><br></center>
</form>

</body>
</html>