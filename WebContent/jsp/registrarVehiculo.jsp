<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method ="POST" action="IngresarVehiculoController">
		<fieldset>
		<label for ="txtPlaca">Placa</label>
		<input type ="text" name="txtPlaca"> 
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
		<input type="submit" value="Registrar">
		</fieldset>
	</form>
</body>
</html>