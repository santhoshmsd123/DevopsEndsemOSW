<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="product" method="get" modelAttribute="product">
Laptop:<input type="text" name="laptop"><br>
Mobile:<input type="text" name="Mobile"><br>
Books:<input type="text" name="books"><br>
<button>submit</button>
</form:form>
<form:form action="delete" methos="get" modelAttribute="delete">

Enter id no:<input type="number" name="num">
<button>submit</button>
</form:form>
</body>
</html>