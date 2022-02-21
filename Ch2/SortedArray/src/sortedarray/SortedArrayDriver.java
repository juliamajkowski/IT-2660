package sortedarray;

import java.util.Scanner;

public class SortedArrayDriver {

    public static void main(String[] args) {
        int s;
        Scanner input = new Scanner(System.in);
        Node student = new Node();
        
       
        System.out.println("Enter the maximum number of elements to sort:");
        s = input.nextInt();
        student.Array(s);
        student.sort();
        student.print(); 
    }
}
