<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body class="container">


	<c:url value="/UnicaEntradaServlet" var="linkServlet"/>
		<form action="${linkServlet }" method="POST" class="form-group">
		
		<div class="col-md-6 offset-md-3">
			<label>Nome:
				<input type="text" name="nome" class="form-control form-control-sm" value="${aluno.nome }">
			</label>
			<label>Email
				<input type="email" name="email"  class="form-control form-control-sm" value="${aluno.email }">
			</label>
		</div>	
		<br/>
		<div class="   col-md-6 offset-md-3">
			<label>Nip:
				<input type="text" name="nip"  class="form-control form-control-sm" value="${aluno.nip }">
			</label>
			<label>CPF:
				<input type="text" name="cpf" class="form-control form-control-sm"  value="${aluno.cpf }">
			</label>
		</div>	
		<br/>
		<div class="   col-md-6 offset-md-3">
			
			<label>Endereço:
				<input type="text" name="endereco" class="form-control form-control-sm" size="50"  value="${aluno.endereco }">
			</label>
		
			<input type="hidden" name="id" value="${aluno.id }">
			<input type="hidden" name="acao" value="AlteraAluno">
			<input type="submit"  value="Alterar" class="btn btn-secondary">
			</div>
			
		
		<br/>		
		</form>
</body>


</body>
</html>