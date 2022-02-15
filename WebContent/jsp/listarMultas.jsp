<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<style >      
  form{
      margin-top: 0%;
      max-width: 400px;
      padding: 2rem;
      margin-left: 10%;
  }
    table {
    border: 2px solid;
    width: 70%;
    height: 70px;
    margin-bottom: 1%;

  }
  tr:hover{background-color: rgb(84, 133, 254)} 
  div{
    margin-top: 4%;
    max-width: 60%;
    padding: 2rem;
    margin-left: 10%;
  }
</style>
<meta charset="ISO-8859-1">
<title>Listar Multas</title>
</head>
<body>
	<c:set var="v" value="${vehiculo}" />
			<table>
			<tr>
			<td style="font-weight: bold">Placa</td>
			<td style="font-weight: bold">Marca</td>
			<td style="font-weight: bold">Año</td>
			<td style="font-weight: bold">Modelo</td>
			<td style="font-weight: bold">Chasis</td>
			<td style="font-weight: bold">Propietario</td>
			</tr>
			<tr>
			<td>${v.getPlaca()}</td>
			<td>${v.getMarca()}</td>
			<td>${v.getAño()}</td>
			<td>${v.getModelo()}</td>
			<td>${v.getChasis()}</td>
			<td>${v.getPropietario()}</td>
			</tr>
			</table>
			<h2>Multas de Vehículo</h2>
			<table>
			<tr>
			<td style="font-weight: bold">Placa</td>
			<td style="font-weight: bold">Valor</td>
			<td style="font-weight: bold">Año</td>
			<td style="font-weight: bold">Descripcion</td>
			</tr>
			<c:forEach items="${multas}" var="m">
			<tr>
			<td>${m.getPlaca()}</td>
			<td>${m.getValor()}</td>
			<td>${m.getAño()}</td>
			<td>${m.getDescripcion()}</td>
			</tr>
</c:forEach>
	</table>
</body>
</html>