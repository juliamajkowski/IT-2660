package LinkedStudentListing;


import java.util.*;

public class ListingDriver {

    public static void main(String[] args) {
       LinkedStudentListing info =  new LinkedStudentListing();
       int c = 0;
       int flag = 0;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the number of students");
       int s = input.nextInt();
       input.nextLine();
       
       for (int i=0; i<s; i++){
           System.out.println("Enter the info for student " + (i+1));
           String studentListing = input.nextLine();
                    info.insert(studentListing);
       }
          
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
                info.choice(n);
            } 
            
        }
    }
}
