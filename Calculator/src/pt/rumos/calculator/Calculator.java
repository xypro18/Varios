package pt.rumos.calculator;

public class Calculator {

	public static void main(String[] args) {
		//String[] items = args[0].replace(" ", "").split("");
		
		EvaluatorInterface e = new Evaluator();
		double result = e.evaluate(args[0].replace(" ", ""));
		
		System.out.println(result);
		
	}

}
