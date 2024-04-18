<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			<h3> Login </h3>
			<font color='red'>${errMsg}</font>
			<form:form action ="login" modelAttribute="UserLogin"  method ="POST">
			
				<table> 
				
				<tr>
					<td>UserName:</td>
					<td><form:input path="userMail"/><td>
				</tr>
				<tr>
					<td>UserCode:</td>
					<td><form:input path="userIdentity"/><td>
				</tr>
				
				<tr>
					<td></td>
					<td>
						<input type ="submit" value="login"/>
					</td>
				</tr>
			</table>
			
		</form:form>

</body>
</html>