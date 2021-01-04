package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.Banco;

public class AlteraAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String nip = request.getParameter("nip");
		String cpf = request.getParameter("cpf");
		String  email = request.getParameter("email");
		
		
		Banco banco = new Banco();
		Aluno aluno = banco.buscaAlunoPelaId(id);
		aluno.setNome(nome);
		aluno.setEndereco(endereco);
		aluno.setNip(nip);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		
		
		return "redirect:UnicaEntradaServlet?acao=ListaAlunos";
	}
}
