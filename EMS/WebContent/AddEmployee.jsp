<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fo:form action="pagesubmit" method="post" modelAttribute="myemp">
<tr>
<td>Product Id</td>
<td><fo:input path="empId"/></td>
</tr>

<tr>
<td>Product Name</td>
<td><fo:input path="empName"/></td>
</tr>

<tr>
<td>Product Price</td>
<td><fo:input path="empPrice"/></td>
</tr>

<tr>
<td> <input type="submit" value="Add Employee"></td>

</fo:form>

</body>
</html>