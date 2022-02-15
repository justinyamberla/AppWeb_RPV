<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Multa</title>
<style >
form{
    margin: 3rem auto;
    max-width: 350px;
    border: 2px solid;
    padding: 2rem;

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
      margin: 10px 0;
      font-size: 20px;
      font-family: 'Times New Roman', Times, serif;
      
  }
  input[type=text] {
    width: 100%;
    padding: 12px 20px;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }</style>
</head>
<body>
	<c:set var="p" value="${placa}" />
	<form method ="POST" action="IngresarMultasController">
	<h2>Registrar Multa</h2>
		<fieldset>
		<label for ="txtPlaca">Placa</label>
		<input type ="text" value= "${p}" name="txtPlaca" readonly> 
		<br>
		<label for ="txtValor">Valor</label>
		<input type ="text" name="txtValor"> 
		<br>
		<label for ="txtAño">Año</label>
		<input type ="text" name="txtAño"> 
		<br>
		<label for ="txtDescripcion">Descripción</label>
		<input type ="text" name="txtDescripcion"> 
		<br>

		<input type="submit" value="Ingresar">
		</fieldset>
	</form>

</body>
</html>