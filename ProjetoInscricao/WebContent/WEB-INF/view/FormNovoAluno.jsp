<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Aluno</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body class="container">
		<c:url value="/UnicaEntradaServlet" var="linkServlet"/>
		<form action="${linkServlet }" method="POST">
		<div class="col-md-6 offset-md-3">
			<label>Nome:<input type="text"class="form-control form-control-sm" name="nome"></label>
			<label>Email<input type="email" class="form-control form-control-sm" name="email"></label>
		</div>
		<div class="   col-md-6 offset-md-3">
			<label>Nip:<input type="text" class="form-control form-control-sm" name="nip"></label>
			<label>CPF:<input type="text" class="form-control form-control-sm" name="cpf"></label>
		</div>
		<div class="   col-md-6 offset-md-3">
			<label>Endereço:<input type="text" class="form-control form-control-sm" size="50" name="endereco"></label>
		
			<input type="hidden" name="acao" value="NovoAluno">
			<input type="submit" value="Cadastrar" class="btn btn-secondary">
		</div>		
		</form>
	

</body>
</html>