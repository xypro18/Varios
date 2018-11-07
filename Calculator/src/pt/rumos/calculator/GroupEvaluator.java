package pt.rumos.calculator;

import java.util.ArrayList;
import java.util.List;

public class GroupEvaluator {
    
    private List<Integer> stack = new ArrayList<>();

    public boolean isSimpleExpression(char c, int i) {
        switch (c) {
            case ')': return true;
            case '(': stack.add(0, i);
            default:
            return false;
        }
    }

    public int getIndex() {
        int i = stack.get(0);
        stack.remove(0);
        return i+1;
    }    
}
