package pt.rumos.academia.projeto;

import pt.rumos.academia.projeto.helper.EvaluateInterface;
import pt.rumos.academia.projeto.helper.Evaluator;
import pt.rumos.academia.projeto.helper.StackInterface;
import pt.rumos.academia.projeto.helper.StackManager;

public class RPMMachine {
	private StackInterface si;

	public RPMMachine(String[] items) {
		si = new StackManager();
		EvaluateInterface e = new Evaluator();
				
		for(String s:items) {
			e.evaluate(s, si);
		}
		
	}
	
	public double getReult() {
		return si.pop();
	}
}
