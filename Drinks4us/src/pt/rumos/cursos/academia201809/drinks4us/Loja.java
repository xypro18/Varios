package pt.rumos.cursos.academia201809.drinks4us;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.management.RuntimeErrorException;

import exceptions.LojaConfigurationException;
import pt.rumos.cursos.academia201809.drinks4us.business.ArtigosBusiness;
import pt.rumos.cursos.academia201809.drinks4us.business.ClientesBusiness;
import pt.rumos.cursos.academia201809.drinks4us.model.Artigo;
import pt.rumos.cursos.academia201809.drinks4us.model.Cliente;
import pt.rumos.cursos.academia201809.drinks4us.model.Engarrafado;
import pt.rumos.cursos.academia201809.drinks4us.model.Pacote;

public class Loja {
	
	private static void mostraTodosArtigos( ) {
		ArtigosBusiness ab = new ArtigosBusiness();
		List<Artigo> listaArtigos = ab.todos();
		
		for(Artigo a:listaArtigos) {
			System.out.println(a);
		}
	}
	
	private static void mostraArtigos(List<Artigo> listaArtigos) {
	//	ArtigosBusiness ab = new ArtigosBusiness();
	//	List<Artigo> listaArtigos = a;
		
		for(Artigo a:listaArtigos) {
			System.out.println(a);
		}
	}
	
	private static void mostraTodosClientes() {
		ClientesBusiness cb = new ClientesBusiness();
		List<Cliente> listaClientes = cb.todos();
		
		for(Cliente a:listaClientes) {
			System.out.println(a);
		}
	}
	
	
	private static void mostraArtigoMaisCaro() {
		ArtigosBusiness ab = new ArtigosBusiness();
		System.out.println("O Artigo mais caro é: " + ab.maisCaro());
	}
	
	public static void main(String... args) {
		
		//Predicate<Artigo> artigosCaros = a -> a.getPreco() >= 500;
		
		ArtigosBusiness ab = new ArtigosBusiness();
		List<Artigo> listaArtigosCaros = ab.filtro(a -> a.getPreco() >= 500);
		
		mostraArtigos(listaArtigosCaros);
//		System.out.println("O comparador dos artigos é o: " + args[0]);
//		
//		try {
//			mostraTodosArtigos();
//		}catch(LojaConfigurationException ex) {
//			System.out.println("Aconteceu um erro tramado: " + ex.getMessage());
//			throw new RuntimeException(ex.getMessage());
//		}catch(RuntimeException ex) {
//			System.out.println("Aconteceu erro inesperado: " + ex.getMessage());
//		}
		
		

		
	//Engarrafado e = new Engarrafado();
	//new Engarrafado();
	//new Engarrafado();
	
//	Artigo a = new Artigo();
//	Artigo b = new Engarrafado();
	
//	List<Artigo> a = new ArrayList<>();
//	a.add(new Artigo());
//	a.add(new Engarrafado());
//	a.add(new Pacote());
//	
//	a.stream().forEach(i -> System.out.println(i.precoBase()));
//	
//	System.out.println(a.precoBase());
//	System.out.println(b.precoBase());
		
	//	mostraTodosArtigos();
	//	mostraArtigoMaisCaro();
	//	mostraTodosClientes();
		
		/* Cenas 
		Cliente cliente = new Cliente("C1", "Manel", LocalDate.of(1974, 4, 25));
		ShoppingCart sc =  new ShoppingCart(cliente);

		ShoppingCartItem sci = new ShoppingCartItem(new Artigo("A1", "Chardonnay", 40.34));
		ShoppingCartItem sci2 = new ShoppingCartItem(new Artigo("A2", "Laranjada", 0.97));
		sc.adicionarArtigo(sci);
		sc.adicionarArtigo(sci);
		sc.adicionarArtigo(sci2);	
		
//		sc.removerArtigo(sci.getArtigo().getNumero());
//		sc.removerArtigo(sci.getArtigo().getNumero());
		
		System.out.println(sc);
		*/
	}

}
