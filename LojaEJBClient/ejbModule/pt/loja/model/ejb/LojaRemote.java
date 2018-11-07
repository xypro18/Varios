package pt.loja.model.ejb;

import java.util.List;

import javax.ejb.Remote;

import pt.loja.model.Produto;

@Remote
public interface LojaRemote {
	
	Produto obtemProduto(int id);
	List<Produto> obtemProdutos();
	
}
