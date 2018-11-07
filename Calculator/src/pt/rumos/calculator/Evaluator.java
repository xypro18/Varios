package pt.rumos.calculator;

public class Evaluator implements EvaluatorInterface{
	
    public double evaluate(String s) {

        StringBuilder sb = new StringBuilder(s);
        GroupEvaluator ge = new GroupEvaluator();
        
        for(int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if (ge.isSimpleExpression(sb.charAt(i), i)) {
                int start = ge.getIndex();
                String simpleExpression = sb.substring(start, i);
                double result = new SimpleEvaluator().evaluate(simpleExpression);
                sb.replace(start-1, i+1, String.valueOf(result));
            }
        }
		return Double.parseDouble(sb.toString());
    }

}
