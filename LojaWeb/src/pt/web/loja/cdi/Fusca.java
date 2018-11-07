package pt.web.loja.cdi;

import javax.enterprise.inject.Alternative;


public class Fusca implements Carro{

	@Override
	public String anda() {
		return "Sou fusca";
	}

}
