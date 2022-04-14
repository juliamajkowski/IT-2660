package BinaryTree;

import java.util.*;

public class Listing {
    private String name;
    private double gpa;
    private int number; 
    Scanner userInput = new Scanner(System.in);
    public Listing()
    {
        name="";
        gpa=0.0;
        number=0;
    }
    public Listing(String n, double g, int num)
    {
        name = n;
        gpa = g;
        number = num;
    }
    public String toString()
    {
        return(name+ " " + gpa + " " + number);
    }
    public Listing deepCopy()
    {
        Listing clone = new Listing(name, gpa, number);
        return clone;
    }
    public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
    }
     public String getKey(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void input()
    {
         
         System.out.println("Enter a name: ");
         name = userInput.nextLine();
         System.out.println("Enter a GPA: ");
         gpa = userInput.nextDouble();
         System.out.println("Enter a number: ");
         number = userInput.nextInt();
         userInput.nextLine();
    }
   
}
