package pt.loja.ejbs;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import pt.loja.model.Produto;
import pt.loja.repository.ProdutosDAO;

/**
 * Message-Driven Bean implementation class for: ProdutosQueueMDB
 */
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "produtosqueue"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") }, mappedName = "jms/produtosqueue")
public class ProdutosQueueMDB implements MessageListener {
	
	@EJB
	ProdutosDAO produtosDao;

	/**
	 * Default constructor.
	 */
	public ProdutosQueueMDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {

		TextMessage msg = null;

		try {
			if (message instanceof TextMessage) {
				msg = (TextMessage) message;
				System.out.println("Mensagem: " + msg.getText());
				Produto p = new Produto();
				p.setId((int) System.currentTimeMillis() % 1000000);
				p.setNome(msg.getText());
				p.setPreco(System.currentTimeMillis() / 1000000);
				produtosDao.insereProduto(p);
			}
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
