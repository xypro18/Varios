package pt.web.loja;

import java.io.IOException;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueueServlet
 */
@WebServlet("/QueueServlet")
public class QueueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
//	@Resource(mappedName = "jms/produtosconectionfactory")
	private static ConnectionFactory connectionFactory;
    
//	@Resource(mappedName = "jms/produtosqueue")
	private static Queue queue;
	
	{
		InitialContext context;
		try {
			context = new InitialContext();
			connectionFactory = (ConnectionFactory) context.lookup("jms/produtosconectionfactory");
			queue = (Queue) context.lookup("jms/produtosqueue");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = connectionFactory.createConnection();
			Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(queue);
			
			Message message  = session.createTextMessage("Olá sou a mensagem: " + request.getParameter("msg"));
			
			producer.send(message);
			
		} catch (JMSException e) {
			response.getOutputStream().print("Miseria: " + e.getMessage());
			return;
		}
		
		response.getOutputStream().print("Enviei a msg = " + request.getParameter("msg"));
	}

}
