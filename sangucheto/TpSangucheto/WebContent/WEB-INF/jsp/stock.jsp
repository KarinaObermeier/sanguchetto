<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h1>Stock Ingredientes</h1>
      <table >
  	   <thead>
         <tr>
           <th>Ingrediente</th>
           <th>Cantidad</th>
           <th>Tipo</th>
         </tr>
       </thead>
        <tbody>
        	<c:forEach var="ingrediente" items="${stock}">
			<tr>
				<td>${ingrediente.key.nombre}</td>
				<td>${ingrediente.key.precio}</td>
				<td>${ingrediente.key.tipo}</td>
			</tr>
		   </c:forEach>
        </tbody>
 	</table>
      
</body>
</html>