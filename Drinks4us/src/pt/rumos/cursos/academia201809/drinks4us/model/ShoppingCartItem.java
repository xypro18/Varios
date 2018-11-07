package pt.rumos.cursos.academia201809.drinks4us.model;

public class ShoppingCartItem {
	private Artigo artigo;
	private int quantidade;
	
	public ShoppingCartItem(Artigo artigo) {
		this.artigo = artigo;
		quantidade = 1;
	}

	public Artigo getArtigo() {
		return artigo;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementaQuantidade() {
		++quantidade;
	}
	
	public void decrementaQuantidade( ) {
		if(quantidade > 0) {
			--quantidade;
		}
	}
	
	@Override
	public String toString() {
		return artigo + ": " + quantidade + "\n";
	}
	
}
