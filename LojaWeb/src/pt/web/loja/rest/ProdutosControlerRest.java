package pt.web.loja.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import pt.loja.model.Produto;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/produtos")
public class ProdutosControlerRest {

	private JsonObject buildProdutoJson(Produto p) {
		return Json.createObjectBuilder().add("nome", p.getNome()).add("id", p.getId()).add("preco", p.getPreco())
				.build();
	}

	@GET
	@Path("ping")
	@Produces({ "application/xml", "application/json" })
	public JsonObject ping() {
		return Json.createObjectBuilder().add("message", "pong").build();
	}
	
	@GET
	@Path("{id}")
	@Produces({ "application/xml", "application/json" })
	public JsonObject obtemProduto(@PathParam("id") int id) {
		Produto p  = new Produto();
		p.setId(id);
		p.setNome("Berlindes");
		p.setPreco(25.3);
		
		return Json.createObjectBuilder().add("produto", buildProdutoJson(p)).build();
	}
	
	@GET
	@Path("echo")
	@Produces({ "application/xml", "application/json" })
	public JsonObject echo(@QueryParam("msg") String msg) {
		return Json.createObjectBuilder().add("msg", msg).build();
	}
	
	@POST
	@Path("produto")
	@Consumes("application/json")
	public Response novoProduto(Produto p) {
		System.out.println(p.getId());
		return Response.ok().build();
	}
	
	
	
}
