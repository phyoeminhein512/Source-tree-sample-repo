<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<label>Student Search Page</label>
	<table>
		<tr>
			<td>Student No</td>
			<td><input type="text"></td>
			<td>Student Name</td>
			<td><input type="text"> </td>
		</tr>
		<tr>
			<td>Class Name</td>
			<td><input type="text" > </td>
		</tr>
	</table>
	<input type="submit" name="search" value="Search">
	<input type="submit" name="reset" value="Reset">
	<p>Message</p>
</body>
</html>