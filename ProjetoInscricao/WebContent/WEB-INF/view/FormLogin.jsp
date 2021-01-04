<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<body class="container">
	
	<c:url value="/UnicaEntradaServlet" var="LinkServlet"/>
	<form action="${LinkServlet }" method="post" >
	
	
	<div class="col-md-6 offset-md-4">
	<h2>Cadastro de Alunos</h2>
		<label>Login:<br>
			<input type="text" class="form-control" name="login"/>
		</label>
		<br>
		<label>Senha:<br>
			<input type="password" class="form-control" name="senha"/>
		</label>
		<br>		<br>
		
		<input type="submit" value="Entrar" class="btn btn-outline-secondary"/>
		<input type="hidden" name="acao" value="Login"/>
	</div>	
	</form>
</body>
</html>