package pt.curso.jpa;

import java.lang.reflect.Field;
import java.util.Arrays;

public class PersistanceContext {
	
	
	public static String obterNomeTabela(Produto p) {
		return p.getClass().getSimpleName();
	}
	
	private static String obterListaColunas(Produto p) {
		return String.join(",", 
				Arrays
				.stream(p.getClass().getDeclaredFields())
				.map(f -> f.getName())
				.toArray(String[]::new));
	}
	
	private static String obterListaValores(Produto p) {
		
		return String.join(",", 
				Arrays
				.stream(p.getClass().getDeclaredFields())
				.map(f -> {
					try {
						f.setAccessible(true);
						if (f.getType().getSimpleName().equals("String")) {
							return "'"+f.get(p).toString()+"'";
						}
						return f.get(p).toString();
					} catch (Exception e){
						return null;
					}
				})
				.toArray(String[]::new));
	}
	
	private static String obterColunasEValoresNaoPrimaryKey(Produto p) {
		return String.join(", ", 
				Arrays
				.stream(p.getClass().getDeclaredFields())
				.filter(f -> !f.isAnnotationPresent(NossoJPAKey.class))
				.map(f -> {
					try {
						f.setAccessible(true);
						String fieldName = f.getName();
						String fieldValue = f.get(p).toString();
						if (f.getType().getSimpleName().equals("String")) {
							return fieldName + " = '"+fieldValue+"'";
						}
						return fieldName + " = "+fieldValue;
					} catch (Exception e){
						return null;
					}
				})
				.toArray(String[]::new));
	}
	
	private static String obterColunaChave(Produto p) {
		return String.join(" AND ", 
				Arrays
				.stream(p.getClass().getDeclaredFields())
				.filter(f -> f.isAnnotationPresent(NossoJPAKey.class))
				.map(f -> {
					try {
						f.setAccessible(true);
						String fieldName = f.getAnnotation(NossoJPAKey.class).outro();
						String fieldValue = f.get(p).toString();
						if (f.getType().getSimpleName().equals("String")) {
							return fieldName + " = '"+fieldValue+"'";
						}
						return fieldName + " = "+fieldValue;
					} catch (Exception e){
						return null;
					}
				})
				.toArray(String[]::new));
	}
		
	
	/**
	 * UPDATE <tabela> SET nome = 'nosso nome', preco = <preco> where id = <valor id>
	 * 
	 * @param p
	 * @return
	 */
	
	public static String generateUpdate(Produto p) {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE ").append(obterNomeTabela(p));
		sb.append(" SET ").append(obterColunasEValoresNaoPrimaryKey(p));
		sb.append(" WHERE ").append(obterColunaChave(p));
		
		return sb.toString();
	}
	
	
	/**
	 * "INSERT INTO <tabela> (COL1, COL2, COL3) VALUES (VAL1, VAL2, VAL3)"
	 * @param p
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	
	public static String generateInsert(Produto p) throws IllegalArgumentException, IllegalAccessException {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("INSERT INTO ").append(obterNomeTabela(p)).append(" ");
		sb.append("(").append(obterListaColunas(p)).append(") ");
		sb.append("VALUES (").append(obterListaValores(p)).append(")");
		return sb.toString();
		

	}
	


	public static void main(String...x) throws IllegalArgumentException, IllegalAccessException {
		
		Produto p = new Produto();
		p.setId(10);
		p.setNome("carica");
		p.setPreco(123.45);
		
		System.out.println(generateInsert(p));
		//System.out.println(obterListaColunas(p));
		System.out.println(generateUpdate(p));
		//System.out.println(p.getClass().getDeclaredFields().length);

	}

}