package pt.rumos.cursos.academia201809.drinks4us.model;

public class Engarrafado extends Artigo {
	private int volume = 750;
	
//	static {
//		System.out.println("Sou um engarrafado static 1");
//	}
//	
//	{
//		System.out.println("Sou um engarrafado anonimo 1");
//	}
	
	public Engarrafado() {
		super("g001", "Codigo da garrafa", 23);
		System.out.println("Sou um engarrafado");
	}
	
//	{
//		System.out.println("Sou um engarrafado anonimo 2");
//	}
//	
//	static {
//		System.out.println("Sou um engarrafado static 2");
//	}
	
	@Override
	public double precoBase() {
		System.out.println("PrecoBase Engarrafado");
		double precoVaselhame = 0.30;
		double precoFinal = precoVaselhame + super.precoBase();
		
		return precoFinal;
	}
	
	public int getVolume() {
		return this.volume;
	}
	

}
