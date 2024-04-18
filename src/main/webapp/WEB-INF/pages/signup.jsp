<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To Do List</title>
</head>
<body>
	<h3> Sign up </h3>
	<font color='blue'>${reg}</font>
	<form:form action ="register" modelAttribute="UserBinding"  method ="POST">
		
		<table> 
				
				<tr>
					<td>Name:</td>
					<td><form:input path="userName"/><td>
				</tr>
				<tr>
					<td>Mail:</td>
					<td><form:input path="userMail"/><td>
				</tr>
				<tr>
    				<td>Phno:</td>
    				<td><form:input path="userPhno" /></td>
				</tr>
				
				<tr>
					<td>UserCode:</td>
					<td><form:input path="userIdentity"/><td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td>
					  <form:radiobutton path="userGender" value ="male"/> Male
					  <form:radiobutton path="userGender" value="Female"/>Female
					<td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type ="submit" value="signup"/>
					</td>
				</tr>
			</table>
			
		</form:form>				
	
</body>
</html>