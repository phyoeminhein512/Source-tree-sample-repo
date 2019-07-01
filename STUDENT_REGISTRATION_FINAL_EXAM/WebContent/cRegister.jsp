<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitio nal//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    padding: 10px;
}
#mes{
	color: red;
}
</style>
</head>
<body>
 <%@ taglib prefix="s" uri="/struts-tags"%>
	<jsp:include page="link.html"></jsp:include>
	<br>
	<label>Class Register</label><br>
	<br>
	<label id="mes">Message</label>
	<s:form action="cRegister">
	<table>
		<tr>
			<td style="background-color: #FACB6E" width="200px;">ClassID	*</td>
			<td style="width: 500px;"><s:textfield name="info.class_id"></s:textfield> </td>
		
		</tr>
		<tr>
			<td  style="background-color: #FACB6E">Class Name *</td>
			<td ><s:textfield name="info.class_name"></s:textfield> </td>
		</tr>
		
	</table>
	<s:submit value="Register"/>
</s:form>
	
</body>
</html>