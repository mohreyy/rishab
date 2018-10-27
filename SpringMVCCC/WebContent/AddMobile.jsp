<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Mobile Details</h3>
<table>
<fo:form action="addData" method="post" modelAttribute="my">
<tr>
<td>Mobile Id</td>
<td><fo:input path="mobileId"/> </td>
<td><fo:errors path="mobileId"/></td>
</tr>

<tr>
<td>Mobile Name</td>
<td><fo:input path="mobileName"/> </td>
<td><fo:errors path="mobileName"/></td>
</tr>

<tr>
<td>Mobile Price</td>
<td><fo:input path="mobPrice"/> </td>
</tr>

<tr>
<td>Mobile Category</td>
<td><fo:select path="mobCategory" items="${cato}"></fo:select> 
</td>
</tr>

<tr>
<td>
Check Online    
<fo:radiobutton path="Online" value="Y"/>Yes
<fo:radiobutton path="Online" value="N"/>No
</td>
</tr>



<tr>
<td>
<input type="Submit" value="Add Mobile" />
</td>
</tr>
</fo:form>
</table>



</body>
</html>