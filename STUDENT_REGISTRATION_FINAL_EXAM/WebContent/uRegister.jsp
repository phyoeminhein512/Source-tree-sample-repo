<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
</style>
</head>
<body>
	<jsp:include page="link.html"></jsp:include>
	<table>
		<jsp:useBean id="sesUser" class="stuReg.bean.StuInfoBean" scope="session"></jsp:useBean>
		<tr style="background-color: aqua;">
			<th>Label</th>
			<th>With EL Value</th>
			<th>JSP:UseBean Value</th>
		</tr>
		<tr>
			<td>Name</td>
			<td>${sessionScope.sesUser.name}</td>
			<td><jsp:getProperty property="name" name="sesUser"/> </td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${sessionScope.sesUser.email}</td>
			<td><jsp:getProperty property="email" name="sesUser"/></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${sessionScope.sesUser.gender}</td>
			<td><jsp:getProperty property="gender" name="sesUser"/></td>
		</tr>
		<tr>
			<td>Picture</td>
			<td> <img alt="" src="PSM.jpg" width="200px"> </td>
		</tr>
	</table>
</body>
</html>