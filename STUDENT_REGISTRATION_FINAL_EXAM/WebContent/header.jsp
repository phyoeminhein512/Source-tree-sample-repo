<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ taglib prefix="s" uri="/struts-tags"%>
	<div>
	<table>
	<jsp:useBean id="sesUser" class="stuReg.bean.StuInfoBean" scope="session"></jsp:useBean>
		<tr><td>
			<a href="home.jsp">Java Web Development Exam </a></td>
		</tr>
		
			<tr>
				<td>User :${sessionScope.sesUser.user_id}</td>
				<td>${sessionScope.sesUser.user_name}</td>
			</tr>
			<tr>
				<td>Current Date</td>
				<td>YYYY/MM/DD</td>
			</tr>
			<tr>
				<td><s:submit action="logout" value="Logout" /> </td>
			</tr>
		</table>
	</div>
</body>
</html>