package pt.rumos.cursos.academia201809.drinks4us.repositorio;

import java.util.ArrayList;
import java.util.List;

import pt.rumos.cursos.academia201809.drinks4us.helper.ArtigosHelper;
import pt.rumos.cursos.academia201809.drinks4us.model.Artigo;

public class OracleArtigosRepositorio implements ArtigosRepositorio, SizeRepositorio {
	
	private static List<Artigo> artigos = new ArrayList<>();
	
	static {
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "VERDE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "VERDE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ORCACLE_ART_" + System.nanoTime(), "TINTO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
	}
	
	@Override
	public List<Artigo> todos() {
		return artigos;
	}

	@Override
	public int size() {
		return artigos.size();
	}
	
	

}
