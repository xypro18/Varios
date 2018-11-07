package pt.rumos.cursos.academia201809.drinks4us.model;

public class Artigo {
	
	private String numero;
	private String nome;
	private double preco;
	
//	{
//		System.out.println("Sou um artigo anonimo 1");
//	}
	
	public Artigo() {
		this("9999","Artigo Genero", 99);
		System.out.println("Sou um artigo");
	}
	
//	{
//		System.out.println("Sou um artigo anonimo 2");
//	}
//	
//	static {
//		System.out.println("Sou um artigo static");
//	}
	
	public Artigo (String numero, String nome, double preco) {
		this.numero = numero;
		this.nome = nome;
		this.preco = preco;
		System.out.println("Sou um artigo a 3");
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
		.append(numero)
		.append(",")
		.append(nome)
		.append(",")
		.append(preco);
		//return numero + "," + nome + "," + preco;
		return sb.toString();
	}
	
	public double precoBase() {
		System.out.println("Estou no preço base do artigo");
		return getPreco();
	}

}
