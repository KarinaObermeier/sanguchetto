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

			      	<h1>Agregar stock</h1>
			      	<div class="row">
			         	<div class="col-md-12">
				          	<form:form class="form-horizontal" action="agregarStock" role="form" method="post">
				          		<div class="form-group">
				          			<label for="nombre" class="control-label col-md-4">Elegir</label>
					                <div class="col-md-4">
										<form:select class="form-control" id="nombre" path="nombreIngrediente">
											<c:forEach var="ingrediente" items="${listaDeIngredientes}">				
												<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="form-group">
									<label for="cantidad" class="control-label col-md-4">Cantidad</label>
									<div class="col-md-4">
										<form:input class="form-control" id="cantidad" path="cantidad"/>
									</div>
								</div>
								<div class="form-group">
									<input type="submit" class="btn btn-primary" value="Agregar Stock"/>
								</div>
							</form:form>
						</div>
					</div>
		     	 </div>
</body>
</html>