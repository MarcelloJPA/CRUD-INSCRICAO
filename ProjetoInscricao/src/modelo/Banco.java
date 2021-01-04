package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	private static Integer chaveSequencial = 1;
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	/*Alunos Cadastrados Manualmente*/
	static {
		Aluno aluno = new Aluno();
		aluno.setId(chaveSequencial++);
		aluno.setNome("Marcello");
		aluno.setEndereco("Estrada do Cafundá 1757");
		aluno.setNip("12068390");
		aluno.setCpf("13592473786");
		aluno.setEmail("cellolim4jpa@gmail.com");
		
		alunos.add(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.setId(chaveSequencial++);
		aluno2.setNome("Marcello");
		aluno2.setEndereco("Estrada do Cafundá 1757");
		aluno2.setNip("12068390");
		aluno2.setCpf("13592473786");
		aluno2.setEmail("cellolim4jpa@gmail.com");
		
		alunos.add(aluno2);
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void adicionar(Aluno aluno) {
		Banco.alunos.add(aluno);
		aluno.setId(Banco.chaveSequencial++);
	}
	
	public void removeAluno(Integer id) {
		Iterator<Aluno> it = alunos.iterator();
		while(it.hasNext()) {
			Aluno aluno = it.next();
			
			if(aluno.getId() == id) {
				it.remove();
			}
		}
		
	}

	public Aluno buscaAlunoPelaId(Integer id) {
		
		for(Aluno aluno : alunos) {
			if(aluno.getId() == id) {
				return aluno;
			}
		}
		return null;
	}
	
	
	/*Logins Cadastrados*/
	
	static {
		Usuario usuario = new Usuario();
		usuario.setLogin("CelloPH");
		usuario.setSenha("123456");
		
		usuarios.add(usuario);
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("Abrigo");
		usuario2.setLogin("Abrigo");
		
		usuarios.add(usuario2);
	}
	
	public Usuario buscarUsuario(String login, String senha) {
		for(Usuario usuario : usuarios) {
			if(usuario.ehIgual(login,senha)) {
				return usuario;
			}
		}
		return null;	
	}
	
	
}
