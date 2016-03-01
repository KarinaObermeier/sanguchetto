<html>
<head>
    <title>Ejemplo de Spring MVC</title>
</head>
<body>
    Nombre: ${nombre}
    <br>
    Apellido: ${apellido}
    <br>
    EMAIL: ${mail}
    <br>
    <br>
	<!-- para obtener el root de la aplicacion -->
    <a href="${pageContext.request.contextPath}">Volver</a>
</body>
</html>