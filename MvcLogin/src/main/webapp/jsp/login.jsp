<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h1>Login Form</h1>
<form action="../customer/login" method="post">
			<table style="with: 50%">
				
					<tr>
					<td>Username:</td>
					<td><input type="uname" name="uname" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="pw" name="pw" /></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>