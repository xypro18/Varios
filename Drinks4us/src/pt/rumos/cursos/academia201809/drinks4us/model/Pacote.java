package pt.rumos.cursos.academia201809.drinks4us.model;

public class Pacote extends Artigo {

	public double precoBase(float maisPercentagem) {
		return super.precoBase() * maisPercentagem;
	}
	
	public double precoBase(int maisPercentagem) {
		return precoBase(1f + maisPercentagem/100f);
	}
	
	@Override
	public double precoBase() {
		return super.precoBase();
	}
	
}
