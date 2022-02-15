<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">      form{
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
  input[type=text] {
    width: 50%;
    padding: 12px 20px;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }
  input[type=submit] {
    background-color: rgb(84, 133, 254);
    border: none;
    color: white;
    padding: 15px 30px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
    font-family: 'Times New Roman', Times, serif;
    font-size: medium;
  }
  div{
    margin-top: 4%;
    max-width: 60%;
    padding: 2rem;
    margin-left: 10%;
  }</style>
<meta charset="ISO-8859-1">
<title>Listar Multas</title>
</head>
<body>
	<c:set var="v" value="${vehiculo}" />
	${v.getPlaca()}
	${v.getMarca()}
	${v.getAño()}
	${v.getModelo()}
	${v.getChasis()}
	${v.getPropietario()}
	<div>
	<h2>Multas de Vehículo</h2>
	<table>
		<tr>
			<td>Placa</td>
			<td>Valor</td>
			<td>Año</td>
			<td>Descripción</td>
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
	</div>
	
	<form method="get" action="IngresarMultasController">
		<input type ="text" value= "${v.getPlaca()}" name="txtPlaca" readonly>
		<input type=Submit value="Ingresar Multa">
	</form>
	
</body>
</html>