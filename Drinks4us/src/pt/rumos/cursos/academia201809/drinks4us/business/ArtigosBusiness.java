package pt.rumos.cursos.academia201809.drinks4us.business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pt.rumos.cursos.academia201809.drinks4us.model.Artigo;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.ArtigosRepositorio;
import pt.rumos.cursos.academia201809.drinks4us.repositorio.MemoriaArtigosRepositorio;

public class ArtigosBusiness {
	
	private ArtigosRepositorio artigosRepositorio = ArtigoFactory.fabricaArtigosRepositorio();
	
	public List<Artigo> todos() {
		return artigosRepositorio.todos();
	}
	
	public Artigo maisCaro() {
		double p = 0;
		List<Artigo> artigos = todos();
		if (artigos.size()==0) {
			return null;
		}
		Artigo maior = artigos.get(0);
		for(Artigo a : artigos) {
			if(maior.getPreco() < a.getPreco() ) {
				maior = a;
			}
		}
		return maior;
	}
	
	public List<Artigo> filtro(Predicate<Artigo> filtro) {
		List<Artigo> artigos = todos();
		List<Artigo> artigosCaros = new ArrayList<>();
		for(Artigo a:artigos) {
			if(filtro.test(a)) {
				artigosCaros.add(a);
			}
		}
		return artigosCaros;
	}

}
