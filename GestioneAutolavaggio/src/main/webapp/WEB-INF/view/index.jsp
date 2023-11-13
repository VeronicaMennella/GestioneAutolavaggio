<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Benvenuto</h1>


<form action="/insert_veicolo" method= "post">
numero telaio:<input type="text" name="nTelaio" required /> <br>
targa<input type="password" name="targa" required /> <br>
<input type="submit" value="accedi">
</form>
</body>
</html>