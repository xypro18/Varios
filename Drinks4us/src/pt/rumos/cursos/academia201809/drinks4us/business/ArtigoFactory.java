package pt.rumos.cursos.academia201809.drinks4us.business;

import javax.management.RuntimeErrorException;

import exceptions.LojaConfigurationException;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.ArtigosRepositorio;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.MemoriaArtigosRepositorio;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.OracleArtigosRepositorio;

public class ArtigoFactory {
	
	public static final String MEMORIA = "M";
	public static final String ORACLE = "O";
	public static final String GLOBAL_PROPERTY_REPOSITORIO = "repositorio";
	
	public static ArtigosRepositorio fabricaArtigosRepositorio() throws LojaConfigurationException {		
		String sourceRepositorio = System.getProperty(GLOBAL_PROPERTY_REPOSITORIO);
		if(MEMORIA.equals(sourceRepositorio)) {
			return new MemoriaArtigosRepositorio();
		} else if (ORACLE.equals(sourceRepositorio)) {
			return new OracleArtigosRepositorio();
		}
		
		throw new LojaConfigurationException("Não conheço o parametro repositorio com o valor: " + sourceRepositorio);
		
	}

}
