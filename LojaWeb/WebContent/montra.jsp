<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="pt.loja.model.Produto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loja - Montra</title>
</head>
<body>
<h1>A nossa Loja</h1>
<h2>� a melhor loja</h2>
<p>O meu popo: <%= request.getAttribute("carro") %> </p></br>
<b>Produtos</b><br>
<% 
List<Produto> produtos = (List<Produto>)request.getAttribute("produtos"); %>
<% for(Produto p:produtos) {%>
<p>
Codigo = <%=p.getId()%> - <%=p.getNome()%> <br>
Preco = <%=p.getPreco() %> <br>
</p>
<% } %>
</body>

</html>