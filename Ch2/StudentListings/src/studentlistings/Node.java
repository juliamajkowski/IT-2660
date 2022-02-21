package studentlistings;
import java.util.Scanner;
public class Node {
    private String name;
    private double gpa;
    private int number;
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
        return("Name is " + name + "\nGPA is " + gpa +
                "\nNumber is " +  number + "\n");
    }
    public Node deepCopy()
    {
        Node clone = new Node(name, gpa, number);
        return clone;
    }
    public int compareTo(String targetKey)
    {
        return(name.compareTo(targetKey));
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
}
