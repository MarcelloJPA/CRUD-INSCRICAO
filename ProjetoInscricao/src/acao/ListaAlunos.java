package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.Banco;

public class ListaAlunos {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Alunos");
		
		Banco alunos = new Banco();
		
		List<Aluno> lista = alunos.getAlunos();
		
		request.setAttribute("alunos", lista);
		
		return "forward:ListaAlunos.jsp";
		
	}

}
