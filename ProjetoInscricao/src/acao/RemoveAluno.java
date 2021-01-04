package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;

public class RemoveAluno {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Removendo Aluno");
		
		String idParam = request.getParameter("id");
		
		Integer id = Integer.valueOf(idParam);
		
		Banco banco = new Banco();
		banco.removeAluno(id);
		
		return "redirect:UnicaEntradaServlet?acao=ListaAlunos";
	}

}
