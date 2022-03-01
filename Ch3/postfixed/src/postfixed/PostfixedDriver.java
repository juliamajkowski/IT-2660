package postfixed;

import java.util.*;

public class PostfixedDriver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PostFixed mathExpression = new PostFixed();
        String expression;
        
        System.out.println("Enter the expression to be calculated with spaces between each character: ");
        expression = input.nextLine();
        
        mathExpression.evaluate(expression);
    
    }
    
}
    
