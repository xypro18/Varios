package pt.loja.ejbs;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import pt.loja.model.Produto;
import pt.loja.model.ejb.LojaLocal;
import pt.loja.model.ejb.LojaRemote;
import pt.loja.repository.ProdutosDAO;

/**
 * Session Bean implementation class LojaBean
 */
@Stateless
@Local(LojaLocal.class)
@Remote(LojaRemote.class)
@LocalBean
@WebService
public class LojaBean implements LojaLocal, LojaRemote {
	
	@EJB
	ProdutosDAO produtosDao;
	

    /**
     * Default constructor. 
     */
    public LojaBean() {
        // TODO Auto-generated constructor stub
    }
    
    

	/**
     * @see LojaLocal#obterProdutoEspecial(int)
     */
    @WebMethod(operationName = "getProdutoEspecial")
    public Produto obterProdutoEspecial(@WebParam(name="produtoId") int id) {
//    	Produto p = new Produto();
//    	p.setId(1);
//    	p.setNome("Caricas");
//    	p.setPreco(8.5);
//    	return p;
    	
    	return produtosDao.obtemProduto(id);
    }

	/**
     * @see LojaRemote#obtemProduto(int)
     */
    @WebMethod(operationName = "getProduto")
    public Produto obtemProduto(@WebParam(name="produtoId") int id) {
//    	Produto p = new Produto();
//    	p.setId(2);
//    	p.setNome("Tampilha Vintage");
//    	p.setPreco(38.5);
//    	return p;
    	return produtosDao.obtemProduto(id);
    }


	@Override
	public List<Produto> obtemProdutos() {
		return produtosDao.obtemProdutos();
	}

}