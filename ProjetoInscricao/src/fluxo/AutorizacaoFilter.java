package fluxo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/UnicaEntradaServlet")
public class AutorizacaoFilter implements Filter {

   

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void destroy() {}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Autorização Filter");
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
	
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
		
		//Todas as ações que não são Login ou LoginForm são protegidas e vão para tela de Login
		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
		
		
		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
			response.sendRedirect("UnicaEntradaServlet?acao=LoginForm");
			return;
			
		}
		chain.doFilter(request, response);
	}

	
}
