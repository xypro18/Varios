package pt.rumos.cursos.academia201809.drinks4us.repositorio;

import java.util.ArrayList;
import java.util.List;

import pt.rumos.cursos.academia201809.drinks4us.helper.ArtigosHelper;
import pt.rumos.cursos.academia201809.drinks4us.model.Artigo;

public class MemoriaArtigosRepositorio implements ArtigosRepositorio, SizeRepositorio {
	
	private static List<Artigo> artigos = new ArrayList<>();
	
	static {
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VINHO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "GASOSA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VERDE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VERDE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "TINTO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "TINTO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "BRANCO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "BRANCO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "CHAMPAGNE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "CHAMPAGNE_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "WHISKY_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "WHISKY_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "RUM_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "VODKA_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
		artigos.add(new Artigo("ART_" + System.nanoTime(), "ABSINTO_" + System.nanoTime() , ArtigosHelper.dameUmPrecoAte(1000)));
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
