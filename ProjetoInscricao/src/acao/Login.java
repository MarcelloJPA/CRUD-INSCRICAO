package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Banco;
import modelo.Usuario;

public class Login {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
				String paramLogin = request.getParameter("login");
				String paramSenha = request.getParameter("senha");
				
				
				Banco banco = new Banco();
				
				
				
				Usuario usuario = banco.buscarUsuario(paramLogin, paramSenha);
				
				if(usuario != null) {
					System.out.println("Usuario Existe!");
					HttpSession sessao = request.getSession();
					sessao.setAttribute("usuarioLogado", usuario);
					return "redirect:UnicaEntradaServlet?acao=ListaAlunos";
				}
				else {
					System.out.println("Usuario nao existe");
					return "redirect:UnicaEntradaServlet?acao=LoginForm";
				}
				
				
		
		
		
	}

}
