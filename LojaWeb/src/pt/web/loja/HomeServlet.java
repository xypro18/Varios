package pt.web.loja;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.loja.model.Produto;
import pt.loja.model.ejb.LojaRemote;
import pt.web.loja.cdi.Carro;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/home", "/queijadas" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject Carro meucarro;
	
	@EJB
	private LojaRemote lojaEjb;
	
	private int acessos = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		acessos++;
		
		/*Produto p = new Produto();
		p.setId(99);
		p.setNome("Caricas");
		p.setPreco(3.5);*/
		
		//request.setAttribute("produto", lojaEjb.obtemProduto(1));
		request.setAttribute("carro", meucarro.anda());
		request.setAttribute("produtos", lojaEjb.obtemProdutos());

		
		RequestDispatcher rd = request.getRequestDispatcher("/montra.jsp");
		rd.forward(request, response);
				
		
//		RequestDispatcher rd = request.getRequestDispatcher("montra.jsp");
//		rd.forward(request, response);
		
//		response.sendRedirect("/montra.jsp");
		
		//String homePage = buildHomePage(request.getParameter("nome"));
		//response.getWriter().append(homePage);
	}

	private String buildHomePage(String nome) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body><h1>Loja Web</h1>");
		sb.append("Ol� Mundo</br>");
		sb.append("<b>" + nome + "</b> � o visitante n�mero: " + acessos);
		sb.append("</body></html>");
		return sb.toString();
	}

}