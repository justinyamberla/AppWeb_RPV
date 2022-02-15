<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Vehiculos</title>

<style>
input[type=text] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }

  form{
      margin: 2rem auto;
      max-width: 400px;
      padding: 2rem;
      font-family: 'Times New Roman', Times, serif;
      border: 2px solid;

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
  label{
      display: block;
      font-size: 20px;
      font-family: 'Times New Roman', Times, serif;
      
  }
  h1{
    font-family: 'Times New Roman', Times, serif;
    text-decoration: underline;
  }

</style>


</head>
<body>
	<c:set var="p" value="${placa}" />
	<form method ="POST" action="ActualizarVehiculoController">
		<h1>Actualizar Vehículo</h1>   
		<fieldset>
		<label for ="txtPlaca">Placa</label>
		<input type ="text" value= "${p}" name="txtPlaca" readonly> 
		<br>
		<label for ="txtMarca">Marca</label>
		<input type ="text" name="txtMarca"> 
		<br>
		<label for ="txtAño">Año</label>
		<input type ="text" name="txtAño"> 
		<br>
		<label for ="txtModelo">Modelo</label>
		<input type ="text" name="txtModelo"> 
		<br>
		<label for ="txtChasis">Chasis</label>
		<input type ="text" name="txtChasis"> 
		<br>
		<label for ="txtPropietario">Propietario</label>
		<input type ="text" name="txtPropietario"> 
		<br>
		<input type="submit" value="Actualizar">
		</fieldset>
	</form>
	
</body>
</html>