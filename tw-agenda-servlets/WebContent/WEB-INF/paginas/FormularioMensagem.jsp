<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Digite seu nome...</title>
</head>
<body>
	<form method="post" action="/tw-agenda-servlets/mensagem" enctype="application/x-www-form-urlencoded">
		<p>Digite seu nome:</p>
		<p><input type="text" name="nomeUsuario"></input></p>
		<button type="submit">Enviar!</button> 
	</form>
</body>
</html>