package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.Banco;

public class NovoAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Cadastrando Novo Aluno");
		
		String nomeAluno = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String nip = request.getParameter("nip");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAluno);
		aluno.setEndereco(endereco);
		aluno.setNip(nip);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		
		Banco banco = new Banco();
		banco.adicionar(aluno);
		
		
		
		return "redirect:UnicaEntradaServlet?acao=ListaAlunos";
		
	}
}
