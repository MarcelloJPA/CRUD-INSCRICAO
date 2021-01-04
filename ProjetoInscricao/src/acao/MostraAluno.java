package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.Banco;

public class MostraAluno {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
			System.out.println("Mostrando Aluno");
			
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);
			
			
			Banco banco = new Banco();
			
			
			Aluno aluno = banco.buscaAlunoPelaId(id);
			
			request.setAttribute("aluno", aluno);
		
		
		
			return "forward:FormAlteraAluno.jsp";
	}

}
