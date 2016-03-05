<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Alta Producto</title>
		
	</head>
	<body>

	
	
	<div id="wrap">
		<div class="container">
    		<div class="starter-template">
      			<h1>Dar de alta ingrediente</h1>
      			<div class="row">
          			<div class="col-md-12">
          				<form:form class="form-horizontal" action="darAlta" commandName="ingrediente" role="form" method="post">
          					<div class="form-group">
          						<label for="nombre" class="control-label col-md-4">Nombre</label>
   						        <div class="col-md-4">
									<form:input class="form-control" id="nombre" path="nombre"/>
								</div>
							</div>
							<div class="form-group">
								<label for="precio" class="control-label col-md-4">Precio</label>
               					<div class="col-md-4">
									<form:input class="form-control" id="precio" path="precio"/>
								</div>
							</div>
							<div class="form-group">
								<label for="tipo" class="control-label col-md-4">Tipo</label>
               					<div class="col-md-4">
									<form:select class="form-control" id="precio" path="tipo">
				          				<form:options items="${tipos}"/>
				      			  	</form:select>
								</div>
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Dar Alta"/>
							</div>
						</form:form>
					</div>
				</div>
		    </div>
	    </div>
      	<div id="push"></div>
	</div><!-- /#wrap -->


</body>
</html>