<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Dar Alta Producto</title>
</head>

<body>
<form:form method="POST" action="/TpSangucheto/darAlta">
   <table>
    <tr>
        <td><form:label path="nombre" >Seleccione Producto</form:label></td>
        <td><form:input path="nombre" /></td>
    </tr>
     <tr>
        <td><form:label path="precio">Precio</form:label></td>
        <td><form:input path="precio" /></td>
    </tr>
    <tr>
     <form:label path="tipo">Tipo</form:label>
      <form:select  path="tipo">
       				<form:options items="${tipos}"/>
   	  </form:select>
	</tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
  </table>  
</form:form>
</body>
</html>

