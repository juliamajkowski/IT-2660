package postfixed;

import java.util.*;
import java.lang.*;

public class PostFixed {
    
    double solution = 0;
  
    public void evaluate(String expression){
        String thisToken;
        
        
        Stack<String> integers = new Stack<String>();

        
        Stack<String> operators = new Stack<String>();
        
        StringTokenizer tokens = new StringTokenizer(expression);
        
        while (tokens.hasMoreTokens()){
        
            thisToken = tokens.nextToken();
            
            if (thisToken.equals("+") || thisToken.equals("-") || thisToken.equals("*") || thisToken.equals("/")){
             
                operators.push(thisToken);
            } else{
                integers.push(thisToken);
            }
        
        }
        int a =  Integer.parseInt(integers.pop());
        int b = Integer.parseInt(integers.pop());
        String op = operators.pop();
        double n1 = a;
        double n2 = b;
        solution = calculate(op, n1, n2);
        
        System.out.println(expression + " = " + solution);
        
    }
    
    public double calculate(String op, double n1, double n2){
          
        switch (op)
        {
        case "+":
            solution =  n1 + n2;
            break;
        case "-":
            solution = n1 - n2;
            break;
        case "*":
            solution = n1 * n2;
            break;
        case "/":
            if (n2 == 0)
                System.out.println("Cannot divide by 0");
            solution =  n1 / n1;
            break;
        }
        return solution;
    }
}