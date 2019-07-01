<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<h1 style="background-color=orange">
		<u>Java Web Development Exam</u>
	</h1>
	<div align="center">
	
	<label style="color:red;">Login${requestScope.err }</label>
		<s:form action="Login" method="post">
			<s:label style="color:red">Message</s:label>
			<s:textfield name="user.user_id" label="User ID"></s:textfield>
			<br>
			<s:password name="user.password" label="Password"></s:password>
			<br>
			<s:submit value="Login" />
		</s:form>
	</div>
</body>
</html>