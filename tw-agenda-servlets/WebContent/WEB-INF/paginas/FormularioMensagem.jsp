<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Digite seu nome...</title>
</head>
<body>
	<form method="post" action="/tw-agenda-servlets/mensagem">
		<p>Digite seu nome: </p>
		<p><input type="text" name="nomeUsuario"></p>
		<button type="submit">Enviar!</button>
	</form>
</body>
</html>