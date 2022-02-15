<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Vehiculos</title>
<style>
	      form{
      margin-top: 4%;
      margin-left: 53%;
      max-width: 400px;
      padding: 1rem ;

  }
  table {
    border: 2px solid;
    width: 90%;
    height: 70px;
    margin-bottom: 10%;

  }
  input[type=submit] {
    background-color: rgb(84, 133, 254);
    border: none;
    color: white;
    padding: 15px 30px;
    text-decoration: none;
    margin-left: 62%;
    cursor: pointer;
    font-family: 'Times New Roman', Times, serif;
    font-size: medium;
  }
  tr:hover{background-color: rgb(84, 133, 254)} 
  div{
    margin-top: 4%;
    max-width: 80%;
    padding: 2rem;
    margin-left: 10%;
  }
  thead{border: 2px solid;}


	
</style>
</head>
<body>
	<form method ="GET" action="IngresarVehiculoController">
		<input type="submit" value="NuevoVehiculo">
	</form>
	<div>
        <h2>Lista de Vehículos</h2>
	<table>
		<caption>Lista de Vehiculos de la BDD</caption>
		
		<tr>
			<td>Placa</td>
			<td>Marca</td>
			<td>Año</td>
			<td>Modelo</td>
			<td>Chasis</td>
			<td>Propietario</td>
			<td>Acciones</td>
		</tr>
		<c:forEach items="${vehiculos}" var="vehiculo">
			<tr>
				<td>${vehiculo.getPlaca()}</td>
				<td>${vehiculo.getMarca()}</td>
				<td>${vehiculo.getAño()}</td>
				<td>${vehiculo.getModelo()}</td>
				<td>${vehiculo.getChasis()}</td>
				<td>${vehiculo.getPropietario()}</td>
				<td><a href="ListarMultasAdminController?Placa=${vehiculo.getPlaca()}">Listar Deudas</a>|<a href="ActualizarVehiculoController?Placa=${vehiculo.getPlaca()}">Actualizar</a>|<a href="EliminarVehiculoController?Placa=${vehiculo.getPlaca()}">Eliminar</a></td>
			</tr>
		</c:forEach>
		
		
	</table>
	</div>
</body>
</html>