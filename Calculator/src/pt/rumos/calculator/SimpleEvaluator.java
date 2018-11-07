package pt.rumos.calculator;

import java.util.ArrayList;
import java.util.List;

public class SimpleEvaluator implements EvaluatorInterface {
	List<String> str = new ArrayList<>();
	
	
	@Override
	public double evaluate(String s) {
		getList(s);
		
		primaryOperations();
		secondaryOperations();
		
		return Double.parseDouble(str.get(0));

	}
	
//	@Override
//	public double getResult() {
//		return Double.parseDouble(str.get(0));
//	}
	
	
	private void primaryOperations() {
		for(int i=0; i < str.size() ; i++) {
			if (str.get(i).equals("*")) {
				multiply(i);
				i -= 2;
			} else if (str.get(i).equals("/")) {
				divide(i);
				i -= 2;
			}
		}
	}
	
	private void secondaryOperations() {
		for(int i=0; i < str.size() ; i++) {
			if (str.get(i).equals("+")) {
				plus(i);
				i -= 2;
			} else if (str.get(i).equals("-")) {
				minus(i);
				i -= 2;
			}
		}
	}
	

	
	private void multiply(int pos) {
		double d1 = Double.parseDouble(str.get(pos-1));
		double d2 = Double.parseDouble(str.get(pos+1));
		str.set(pos, String.valueOf(d1 * d2));
		str.remove(pos-1);
		str.remove(pos);
	}
	
	private void divide(int pos) {
		double d1 = Double.parseDouble(str.get(pos-1));
		double d2 = Double.parseDouble(str.get(pos+1));
		str.set(pos, String.valueOf(d1 / d2));
		str.remove(pos-1);
		str.remove(pos);
	}
	
	private void plus(int pos) {
		double d1 = Double.parseDouble(str.get(pos-1));
		double d2 = Double.parseDouble(str.get(pos+1));
		str.set(pos, String.valueOf(d1 + d2));
		str.remove(pos-1);
		str.remove(pos);
	}
	
	private void minus(int pos) {
		double d1 = Double.parseDouble(str.get(pos-1));
		double d2 = Double.parseDouble(str.get(pos+1));
		str.set(pos, String.valueOf(d1 - d2));
		str.remove(pos-1);
		str.remove(pos);
	}
	

	
	private void getList(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char e = s.charAt(i);
			if (isNumeric(e)) {
				sb.append(e);
			} else {
				str.add(sb.toString());
				sb = new StringBuilder();
				str.add(s.substring(i, i+1));
			}			
		}
		str.add(sb.toString());
	}
	
	private static boolean isNumeric(char c) {
		if (c>= '0' && c<= '9' || c=='.') {
			return true;
		}
		return false;		
	}
	
}
