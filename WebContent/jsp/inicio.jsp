<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<style>
    form{
      margin: 2rem auto;
      max-width: 400px;
      padding: 2rem;

  }

  label{
      display: block;
      
      font-size: 20px;
      font-family: 'Times New Roman', Times, serif;
      
  }
  input[type=radio] {
  width: 20%;
  
  margin: 8px 8px 8px 8px;
  box-sizing: border-box;
  cursor: pointer;
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

  input[type=text] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }
  input[type=password] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    font-family: 'Times New Roman', Times, serif, "Helvetica Neue", Helvetica, sans-serif;
    font-size: 17px;
  }
</style>


</head>
<body>
	<form method ="POST" action="LoginController">
		<fieldset>
		<h2>Ingresar al Sistema:</h2>
		<label for ="txtUsuario">Usuario</label>
		<input type ="text" name="txtUsuario"> 
		<br>
		<label for ="txtClave">Clave</label>
		<input type ="password" name="txtClave">
		<br>
		<input type="submit" value="Ingresar">
		</fieldset>
	</form>
	
	<form method ="POST" action="ListarMultasController">
		
		
		<fieldset>
		<h2>Consultar Vehículo:</h2>
		<div>
			<label for="Placa">Placa
			<input type="radio" id="Placa" name="rbtnDato" value="Placa" checked>
	  		</label>
		</div>

		<div>
			<label for="Chasis">Chasis
	   		<input type="radio" id="Chasis" name="rbtnDato" value="Chasis">
			 </label>
		</div>

		<br>
		<label for ="txtDato">Ingresar Dato</label>
		<input type ="text" name="txtDato"> 
		<br>
		
		<input type="submit" value="Consultar">
		</fieldset>
	</form>
	
</body>
</html>