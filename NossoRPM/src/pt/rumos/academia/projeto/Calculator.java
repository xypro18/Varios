package pt.rumos.academia.projeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
	
	static List<String> validOperators = new ArrayList<>();
	
	static {
		validOperators.add("*");
		validOperators.add("/");
		validOperators.add("+");
		validOperators.add("-");
		validOperators.add("^");
	}
	

	public static void main(String[] args) {
		
		String[] items = args[0].split(" ");
		
		RPMMachine rpm = new RPMMachine(items);
		System.out.println(rpm.getReult());
		
//		for(String s:items) {
//			go.evaluate(s);

			
//			if(os.isValidO) {	
//				binaryOp(pushPop, s);
//			} else if (isUnaryOp(s)) {
//				unaryOp(pushPop, s);
//			} else {
//				pushPop.add(0, Double.parseDouble(s));
//			}
//		}		

	}
	
	private static void binaryOp(List<Double> stack, String op) {
		switch (op) {
		case "*": bPushPop(stack, stack.get(0) * stack.get(1));
		break;
		case "/": bPushPop(stack, stack.get(0) / stack.get(1));
		break;
		case "+": bPushPop(stack, stack.get(0) + stack.get(1));
		break;
		case "-": bPushPop(stack, stack.get(0) - stack.get(1));
		break;
		case "^": bPushPop(stack, Math.pow(stack.get(0) , stack.get(1)));
		break;
		default: throw new RuntimeException("Erro na operação");
		}
	}
	
	private static void bPushPop(List<Double> stack, double result) {
		stack.remove(0);
		stack.set(0, result);
	}

	private static void unaryOp(List<Double> stack, String op) {
		switch (op) {
		case "sqrt": stack.set(0, Math.sqrt(stack.get(0)));
		case "exp": stack.set(0, Math.exp(stack.get(0)));
		break;
		default: throw new RuntimeException("Erro na operação");
		}
	}


	static boolean isBinaryOp(String s) {
		switch (s) {
		case "*": 
		case "/": 
		case "+": 
		case "-": 
		case "^": return true;
		default: return false; 
		}
	}
	
	static boolean isUnaryOp(String s) {
		switch (s) {
		case "exp": 
		case "sqrt": return true;
		default: return false; 
		}
	}

	private static double operationResult(String n1, String n2, String op) {
		double d1 = Double.parseDouble(n1);
		double d2 = Double.parseDouble(n2);

		switch (op) {
		case "*":
			return d1 * d2;
		case "/":
			return d1 / d2;
		case "+":
			return d1 + d2;
		case "-":
			return d1 - d2;
		case "^":
			return Math.pow(d1, d2);
		default:
			throw new RuntimeException("Erro na operação");
		}
	}

}
