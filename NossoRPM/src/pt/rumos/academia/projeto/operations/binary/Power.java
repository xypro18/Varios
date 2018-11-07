package pt.rumos.academia.projeto.operations.binary;

import pt.rumos.academia.projeto.helper.StackInterface;
import pt.rumos.academia.projeto.operations.Operations;

public class Power implements Operations{

	@Override
	public void evaluate(StackInterface s) {
		s.push(Math.pow(s.pop(), s.pop()));
	}

}
