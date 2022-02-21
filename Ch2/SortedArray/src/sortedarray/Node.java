package sortedarray;
import java.util.Scanner;

public class Node {
    
    private String name;
    private double gpa;
    private int number;
    String array[];
    
    public Node()
    {
        name="";
        gpa=0.0;
        number=0;
    }
    public Node(String n, double g, int num)
    {
        name = n;
        gpa = g;
        number = num;
    }
    public String toString()
    {
        return(name + " " + gpa + " " +  number);
    }
    public void input()
    {
         Scanner userInput = new Scanner(System.in);
         System.out.println("Enter a name: ");
         name = userInput.nextLine();
         System.out.println("Enter a GPA: ");
         gpa = userInput.nextDouble();
         System.out.println("Enter a number: ");
         number = userInput.nextInt();
    }
    public void Array(int s){
        array = new String[s];
        for (int i = 0; i < s; i++){
            input();
            array[i] = toString();
        }
    }
    public void sort(){    
        String temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public void print(){
        System.out.println("Sorted elements :");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

