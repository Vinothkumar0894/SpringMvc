<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="../customer/register" method="post">
			<table style="with: 50%">
				<tr>
					<td>id:</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>name:</td>
					<td><input type="name" name="name" /></td>
				</tr>
				<tr>
					<td>mobile:</td>
					<td><input type="mobile" name="mobile" /></td>
				</tr>
					<tr>
					<td>gender:</td>
					<td><input type="gender" name="gender" /></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="password" name="password" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>