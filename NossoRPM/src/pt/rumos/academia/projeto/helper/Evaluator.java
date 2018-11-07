package pt.rumos.academia.projeto.helper;

import pt.rumos.academia.projeto.operations.binary.*;
import pt.rumos.academia.projeto.operations.unary.SquareRoot;

public class Evaluator implements EvaluateInterface {

	@Override
	public void evaluate(String s, StackInterface si) {
		switch (s) {
		case "*": new Multiply().evaluate(si); //COLOCAR NO CONSTRUTOR?
		break;
		case "/": new Divide().evaluate(si);
		break;
		case "+": new Plus().evaluate(si);
		break;
		case "-": new Minus().evaluate(si);
		break;
		case "^": new Power().evaluate(si);
		break;
		case "sqrt": new SquareRoot().evaluate(si);
		break;
		default:
			si.push(s); 
		}
	}
}