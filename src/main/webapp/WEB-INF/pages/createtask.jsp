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
	<h3> CreateTask </h3>
	<font color='blue'>${task}</font>
	<form:form action ="createtask" modelAttribute="TaskBinding"  method ="POST">
		
		<table> 
				
				<tr>
					<td>TaskName:</td>
					<td><form:input path="taskName"/><td>
				</tr>
				<tr>
    				<td>TaskDate:</td>
    				<td><form:input path="taskDate" type="date" /><td>
    				<%-- <td><form:input path="taskDate" type="text" pattern="\d{2}-\d{2}-\d{4}" /><td> --%>
				</tr>
				<tr>
    				<td>TaskTime:</td>
   					 <td><form:input path="taskTime" type="time" /><td>
   					<%--  <td><form:input path="taskTime" type="text" pattern="\d{2}:\d{2}:\d{2}" /><td> --%>
				</tr>
				
				<tr>
					<td></td>
					<td>
						<input type ="submit" value="create"/>
					</td>
				</tr>
		</table>
			
		</form:form>
				
	<a href ="viewtask">ViewTask</a>
</body>
</html>