package pt.rumos.cursos.academia201809.drinks4us.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	
	private long numero;
	private List<ShoppingCartItem> artigos;
	private Cliente cliente;
	
	public ShoppingCart(Cliente cliente) {
		gerarNumero();
		inicializarArtigos();
		this.cliente = cliente;
	}

	private void inicializarArtigos() {
		artigos = new ArrayList<ShoppingCartItem>();
	}

	private void gerarNumero() {
		numero = System.nanoTime();
	}
	
	public void adicionarArtigo(ShoppingCartItem artigo) {
		
		//Verifica se artigo já existe	
		for(ShoppingCartItem sci:artigos) {
			if(sci.getArtigo().getNumero().equals(artigo.getArtigo().getNumero())) {
				sci.incrementaQuantidade();
				return;
			}
		}
		
		//Adiciona artigo novo
		artigos.add(artigo);
	}
	
	public void removerArtigo(String numeroArtigo) {
		
		//Verifica se artigo já existe	
		for(ShoppingCartItem sci:artigos) {
			if(sci.getArtigo().getNumero().equals(numeroArtigo)) {
				sci.decrementaQuantidade();
			}
		}		
		
		//Verifica se artigo existe e se quantidade = 0, se sim remove
		Iterator<ShoppingCartItem> i = artigos.iterator();
		while(i.hasNext()) {
			ShoppingCartItem a = i.next();
			if(a.getArtigo().getNumero().equals(numeroArtigo)) {
				if (a.getQuantidade() == 0) {
					i.remove();
					return;
				}
			}
		}
		
/*		for(Artigo a:artigos) {
			if (a.getNumero().equals(numeroArtigo)) {
				artigos.remove(a);
//				return;
			}
		}*/
		
	}
	
	public double total() {
		double total = 0.0;
		
		for(ShoppingCartItem i:artigos) {
			total += i.getArtigo().getPreco()*i.getQuantidade();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		
		String lista = "";
		
		//cliente
		lista = lista + "Cliente: \n";
		lista = lista + cliente + "\n";
		lista = lista + "\n";
		
		//artigos
		lista = lista + "Artigos: \n";
		for(ShoppingCartItem a:artigos) {
			lista = lista + a + "\n";					
		}
		
		//total
		lista = lista + "\n";
		lista = lista + "TOTAL = " + total();
		
		
		return lista;
	}

}
