<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html >
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/css/bootstrap.min.css" rel="styleSheet" type="text/css"/>

<title>Sanguchetto</title>
</head>
<body>

<div class="container">
  <div class="jumbotron">
   <i class="icon-edit" ></i>
    <h1>Mi Sanguchetto</h1> <!-- <span class="glyphicon glyphicon-shopping-cart"></span> -->
    <p><a href="producto/armarSangucheto"><span class="glyphicon glyphicon-hand-right"></span> Crear Sanguchetto</a></p>
   
  </div>
  <div class="row"  >
    <div class="col-sm-6">
      <h3><a href="stock"><span class="glyphicon glyphicon-check"></span> Ver Stock</a></h3>
      <p>Listado de los productos existentes</p>
      
    </div>
     <div class="col-sm-6">
      <h3><a href="altaProducto"><span class="glyphicon glyphicon-upload"></span> Alta Producto</a></h3>
      <p>Alta a un producto, agregandole su precio y su stock inicial</p>
      
    </div>
   </div>  
   <div class="row"  >
    <div class="col-sm-6">
      <h3><a href="agregarStock"><span class="glyphicon glyphicon-edit"></span> Agregar Stock</a></h3>
      <p>Agregar stock a un producto seleccionado</p>
    </div>
    <div class="col-sm-6">
      <h3><a href="eliminarStock"><span class="glyphicon glyphicon-trash"></span> Eliminar Stock</a></h3>        
      <p>Dar de baja a un producto seleccionado</p>
     </div>
  </div>
</div>
	
</body>
</html>