<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
Add Product
yahan pr apna smaan jodein!
<table>

<fo:form action="pagesubmit" method="post" modelAttribute="mypro">
<tr>
<td>Product Id</td>
<td><fo:input path="prodId"/></td>
</tr>

<tr>
<td>Product Name</td>
<td><fo:input path="prodName"/></td>
</tr>

<tr>
<td>Product Price</td>
<td><fo:input path="prodPrice"/></td>
</tr>

<tr>
<td> <input type="submit" value="add Product"></td>

</fo:form>
</table>
</body>
</html>