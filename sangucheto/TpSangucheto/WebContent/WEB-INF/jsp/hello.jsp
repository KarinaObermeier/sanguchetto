<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Ejemplo de Spring MVC</title>
</head>
<body>
    ${message}
    <br>
    <!-- para obtener el root de la aplicacion -->
    <a href="${pageContext.request.contextPath}">Volver</a>
    
    <form:form action="saludo" modelAttribute="persona" role="form" method="POST" >

		<table>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td><form:label path="apellido">Apellido</form:label></td>
				<td><form:input path="apellido" /></td>
			</tr>
			<tr>
				<td><form:label path="mail">mail</form:label></td>
				<td><form:input path="mail" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Saludar!" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>