package pt.rumos.academia.projeto.operations.unary;

import pt.rumos.academia.projeto.helper.StackInterface;
import pt.rumos.academia.projeto.operations.Operations;

public class SquareRoot implements Operations {

	@Override
	public void evaluate(StackInterface s) {
		s.push(Math.sqrt(s.pop()));
	}
	

}
