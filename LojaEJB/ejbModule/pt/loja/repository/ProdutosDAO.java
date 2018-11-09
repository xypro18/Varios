package pt.loja.repository;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pt.loja.model.Produto;

/**
 * Session Bean implementation class ProdutosDAO
 */
@Stateless
@LocalBean
public class ProdutosDAO {

	@PersistenceContext(unitName="produtosPU")
	EntityManager gestorEntidades;
	
    public ProdutosDAO() {
        // TODO Auto-generated constructor stub
    }
    
    
    public List<Produto> obtemProdutos(){
    	TypedQuery<Produto> pq = gestorEntidades.createQuery("SELECT p FROM Produto p", Produto.class);
    	return pq.getResultList();
    }
    
    public Produto obtemProduto(int id) {
    	return gestorEntidades.find(Produto.class, id);
    }
    
    public Produto obtemProdutoEspecial(int id) {
    	return (Produto)gestorEntidades.createNativeQuery("SELECT * FROM PRODUTOS P").getResultList().get(0);
    }
    
    public void insereProduto(Produto p) {
    	gestorEntidades.persist(p);

    }
    

}
