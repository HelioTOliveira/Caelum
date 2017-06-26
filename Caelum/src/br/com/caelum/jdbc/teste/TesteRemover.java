package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Contato contato = new Contato();
		
		contato.setId(3);
		
		ContatoDAO dao = new ContatoDAO();
		dao.remove(contato);
		
		System.out.println("Contato Removido");
	}

}
