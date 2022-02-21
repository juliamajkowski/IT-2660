package student;

import java.util.Scanner;

public class Student{
    
    public static void main(String[] args){
        int c = 0;
        int flag = 0;
        StudentInfo entry = new StudentInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int s = input.nextInt();
        entry.Array(s);
          
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
                entry.choice(n);
            } 
            
        }
    }
}

