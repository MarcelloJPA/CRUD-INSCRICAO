package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovoAlunoForm {

	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
			
		
		
		return "forward:FormNovoAluno.jsp";
	}
}
