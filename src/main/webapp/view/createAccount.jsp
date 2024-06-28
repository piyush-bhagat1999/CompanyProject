<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: aqua;">



<form action="createAccountData" method="post"><br><br>
<center><h1>Create Account</h1>


<h3 style="color: red"><%

if(request.getAttribute("msg")!=null){
	out.print(request.getAttribute("msg"));
}
%></h3>



<b  style="margin-right: 7%">Your name</b><br>
<input type="text"  name="name" placeholder="First and last name"><br><br>
<b  style="margin-right: 6%">Enter email</b><br>
<input type="email" name="email" placeholder="Enter email "><br><br>
<b  style="margin-right: 4%">Mobile number</b><br>
<input type="number" name="mobile" placeholder="Enter mobile number "><br><br>
<b  style="margin-right: 7%">Password</b><br>
<input type="password" name="password" placeholder="Enter your password "><br><br>
<b  style="margin-right: 2%">Re-enter password</b><br>
<input type="password" name="repassword" placeholder="Enter Re-enter password "><br><br>
<input type="submit" value="Continue"><br><br>
Already have an account?<a href="loginPage">Sign In</a></center>
</form>
</body>
</html>