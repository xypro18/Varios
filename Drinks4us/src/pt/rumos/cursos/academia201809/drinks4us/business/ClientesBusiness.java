package pt.rumos.cursos.academia201809.drinks4us.business;

import java.util.List;

import pt.rumos.cursos.academia201809.drinks4us.model.Cliente;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.MemoriaClientesRepositorio;

public class ClientesBusiness {
	
	private MemoriaClientesRepositorio memoriaClientesRepositorio = new MemoriaClientesRepositorio();
	
	public List<Cliente> todos() {
		return memoriaClientesRepositorio.todos();
	}

}
