<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Vehiculo</title>
<style>
	      form{
      margin: 2rem auto;
      max-width: 700px;
      padding: 2rem;
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
    margin-top: 5%;
    margin-left: 35%;
    
  }
  input[type=text] {
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }
  input[type=radio] {
    width: 20%;
    padding: 20px 20px;
    margin: 8px 8px 8px 8px;
    box-sizing: border-box;
    cursor: pointer;
  }

</style>

</head>
<body>
	<c:set var="p" value="${placa}" />
	<form action="EliminarVehiculoController" method="POST">
	<h2>
		¿Seguro que quieres eliminar el  vehículo con la placa 
		<input type ="text" value= "${p}" name="txtPlaca" readonly>?
	</h2>
  	<input type="radio" value="Si" name="rbtnDesicion">Si
  	<input type="radio" value="No" name="rbtnDesicion">No
  	<input type="submit" value="Confirmar">
  	
</form>

</body>
</html>