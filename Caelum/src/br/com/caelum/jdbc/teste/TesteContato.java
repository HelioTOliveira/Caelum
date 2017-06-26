package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pronto para gravar
		Contato contato = new Contato();
		
		contato.setNome("teste");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. ZE");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		ContatoDAO dao = new ContatoDAO();
		
		// método elegante
		dao.adiciona(contato);
		System.out.println("Gravado!");
		
	}

}
