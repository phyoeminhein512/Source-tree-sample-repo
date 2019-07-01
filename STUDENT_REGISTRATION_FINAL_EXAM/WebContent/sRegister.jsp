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
	
   Student Register
   <br>
   <p>Meassage</p>
   <s:form>
   	<table>
   		<tr>
   			<td>Student No*</td>
   			<td><s:textfield name="info.stu_id"/></td>
   		</tr>
   		<tr>
   			<td>Student Name*</td>
   			<td><s:textfield name="info.stu_name"></s:textfield></td>
   		</tr>
   		<tr>
   			<td>ClassName</td>
   			<td>
   			 <select name="select">
                                    <option></option>
                                    <option>Java Web Development</option>
                                    <option>Programming Fundamental 1</option>
                                    <option>Programming Fundamental 2</option>
                                    <option>Software Engineering</option>
                                    <option>Android Development</option>
                                    <option>PHP Basic</option>
              </select>  
   			</td>
   		</tr>
   		<tr>
   			<td>Register Date</td>
   			<td>  
               <select name="year">
                                
                                   <option>Year</option>
                                   <option>2016</option>
                                   <option>2015</option>
                                   <option>2014</option>
                                   <option>2013</option>
                                   <option>2012</option>
                                   <option>2011</option>
                                   <option>2010</option>
                                   <option>2009</option>
                                </select>  
								<select name="month">
								
                                   <option>Month</option>
                                   <option>01</option>
                                   <option>02</option>
                                   <option>03</option>
                                   <option>04</option>
                                   <option>05</option>
                                   <option>06</option>
                                   <option>07</option>
                                   <option>08</option>
                                   <option>09</option>
                                   <option>10</option>
                                   <option>11</option>
                                   <option>12</option>
                                </select> 
								<select name="day">
                                   <option>Day</option>
                                   <option>01</option>
                                   <option>02</option>
                                   <option>03</option>
                                   <option>04</option>
                                   <option>05</option>
                                   <option>06</option>
                                   <option>07</option>
                                   <option>08</option>
                                   <option>09</option>
                                   <option>10</option>
                                   <option>11</option>
                                   <option>12</option>
                                   <option>13</option>
                                   <option>14</option>
                                   <option>15</option>
                                   <option>16</option>
                                   <option>17</option>
                                   <option>18</option>
                                   <option>19</option>
                                   <option>20</option>
                                   <option>21</option>
                                   <option>22</option>
                                   <option>23</option>
                                   <option>24</option>
                                   <option>25</option>
                                   <option>26</option>
                                   <option>27</option>
                                   <option>28</option>
                                   <option>29</option>
								   <option>30</option>
                                   <option>31</option>
                                </select> 
   			</td>
   		</tr>
   		<tr>
   			<td>Status </td>
   			<td></td>
   		</tr>
   	
   	</table>
   	<s:submit value="Register" action="sRegister"></s:submit>
   
   </s:form>
   
</body>
</html>