<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="process.jsp">  
<input type="text" name="uid" value="Enter EmployeeID" onclick="this.value=''"/><br/>  
<input type="text" name="uname"  value="Enter your Name" onclick="this.value=''"/><br/>  
<input type="Password" name="upass"  value="Enter Password" onclick="this.value=''"/><br/>  
Select Technologies: 
<input type="checkbox" name="id" value="Java"> Java<BR>
<input type="checkbox" name="id" value=".NET"> .NET<BR>
<input type="checkbox" name="id" value="PHP"> PHP<BR>
<input type="checkbox" name="id" value="C/C++"> C/C++<BR>
<input type="checkbox" name="id" value="PERL"> PERL <BR>
Select Gender:
<input type="radio" name="M" value="Male"> Male <br>
<input type="radio" name="F" value="Female"> Male <br>
Qualification:
<select>
	<option value="Msc">MSc</option>
	<option value="BTech">BTech</option>
	<option value="MBA">MBA</option>
	<option value="BE">MSc</option>
	</select>
<input type="submit" value="register"/>  
</form>  
</body>
</html>