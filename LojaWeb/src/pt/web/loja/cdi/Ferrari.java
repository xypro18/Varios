package pt.web.loja.cdi;

import javax.enterprise.inject.Alternative;

@Alternative
public class Ferrari implements Carro {

	@Override
	public String anda() {
		return "Acelera que nem um maluco!";	
	}

}
