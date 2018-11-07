package pt.rumos.academia.projeto.operations.binary;

import pt.rumos.academia.projeto.helper.StackInterface;
import pt.rumos.academia.projeto.operations.Operations;

public class Minus implements Operations{

	@Override
	public void evaluate(StackInterface s) {
		s.push(s.pop() - s.pop());
	}

}
