package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		
		return "forward:FormLogin.jsp";
	}

}
