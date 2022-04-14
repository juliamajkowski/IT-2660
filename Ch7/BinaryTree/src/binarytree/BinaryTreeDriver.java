package binarytree;

import java.util.*;

public class BinaryTreeDriver {

   public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       int c = 0;
       Scanner input = new Scanner(System.in);
       while(c==0){
            System.out.println("1.Insert");

            System.out.println("2.view");

            System.out.println("3.delete");

            System.out.println("4.update the student list");

            System.out.println("5.view the alphabetical list");
            
            System.out.println("6. Exit");

            System.out.println("Enter your choice");
            int n=input.nextInt();  
            
            if (n==6){
                c++;
            } else {
                bt.choice(n);
            } 
            
        }
    }
    
}
