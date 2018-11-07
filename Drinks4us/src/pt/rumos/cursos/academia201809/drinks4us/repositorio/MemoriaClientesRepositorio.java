package pt.rumos.cursos.academia201809.drinks4us.repositorio;

import java.util.ArrayList;
import java.util.List;

import pt.rumos.cursos.academia201809.drinks4us.helper.DatasHelper;
import pt.rumos.cursos.academia201809.drinks4us.model.Cliente;

public class MemoriaClientesRepositorio implements SizeRepositorio {
	private static List<Cliente> clientes = new ArrayList<>();
	
	static {
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "ANA_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "SUSANA_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "JAQUIM_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "ADALBERTO_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "JOAO_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "MARIA_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "TONIO_" + System.nanoTime(), DatasHelper.dameUmaData()));
		clientes.add(new Cliente("CLI_" + System.nanoTime(), "GERTRUDES_" + System.nanoTime(), DatasHelper.dameUmaData()));
	}
	
	public List<Cliente> todos() {
		return clientes;
	}

	@Override
	public int size() {
		return clientes.size();
	}

}
