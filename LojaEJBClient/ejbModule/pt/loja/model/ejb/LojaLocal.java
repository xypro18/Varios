package pt.loja.model.ejb;

import javax.ejb.Local;

import pt.loja.model.Produto;

@Local
public interface LojaLocal extends LojaRemote {
	Produto obterProdutoEspecial(int id);	

}
