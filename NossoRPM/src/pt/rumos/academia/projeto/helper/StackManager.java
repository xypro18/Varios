package pt.rumos.academia.projeto.helper;

import java.util.ArrayList;
import java.util.List;

public class StackManager implements StackInterface {
	private List<Double> stack = new ArrayList<>();

	@Override
	public void push(double d) {
		stack.add(0,d);		
	}

	@Override
	public void push(String d) {
		stack.add(0, Double.valueOf(d));	
	}

	@Override
	public double pop() {
		double value = stack.get(0);
		stack.remove(0);
		return value;
	}

}
