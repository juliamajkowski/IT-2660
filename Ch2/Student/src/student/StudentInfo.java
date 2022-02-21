package student;

import java.util.Scanner;

public class StudentInfo {  
    private String name;
    private double gpa;
    private int number;
    String array[], tempArray[];
    Scanner userInput = new Scanner(System.in);
    int result = 0;
    String temp, old, found;
    boolean flag;
    
    public StudentInfo()
    {
        name="";
        gpa=0.0;
        number=0;
    }
    public StudentInfo(String n, double g, int num)
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
         System.out.println("Enter a name: ");
         name = userInput.nextLine();
         System.out.println("Enter a GPA: ");
         gpa = userInput.nextDouble();
         System.out.println("Enter a number: ");
         number = userInput.nextInt();
         userInput.nextLine();
    }
    public void Array(int s){
        array = new String[s];
        for (int i = 0; i < s; i++){
            input();
            array[i] = toString();
        }
       sort();
    }
    public String insert(String insertInfo){
        tempArray = new String [array.length+1];
        for( int i=0; i < array.length; i++){
            tempArray[i] = array [i];
        }
        tempArray [array.length] = insertInfo;
        array = tempArray;
             sort();   
        return "Student information has been added";   
    }
    public String fetch(String searchId){
        for(int i=0; i< array.length; i++){
            if ((array[i].compareTo(searchId)) <= 0){
                 found = "Student not in list";
            } else if (array[i].compareTo(searchId)>0){
                found = array[i];
                i= array.length;
                
            }  
         }
        return found;
        
    }
    public boolean update(String updateId, String temp){
        for(int i=0; i< array.length; i++){
            if (array[i].compareTo(updateId)>0){
                old = array[i];
                array[i] = temp;
                flag = true;
                i= array.length;
            } else{
                flag = false;
            } 
         }
        
            
        return flag;
    }
 
    public boolean delete(String deleteId){
        for(int i=0; i< array.length; i++){
        for (int j=i+1; j< array.length; j++){
            if ((array[i].compareTo(deleteId)) > 0){
                String tempArray [] = new String [array.length-1];
                array[i] = array[i+1];
                for (int k=0; k<tempArray.length; k++){
                    tempArray[k] = array[k];
                }
                i= array.length;
                array = tempArray;
                flag = true;
            }     
        } 
    }
        return flag;
    }
    public void sort(){  
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
    public void choice(int n){
        switch (n){
                case 1:
                    System.out.println("Enter the new student information ");
                    String insertInfo= userInput.nextLine();
                    System.out.println(insert(insertInfo));
                    break;
                case 2:
                    System.out.println("Enter the name of the student whos information is needed");
                    String searchId= userInput.nextLine();
                    System.out.println(fetch(searchId));
                    break;

                case 3:
                    System.out.println("Enter the name of the student to be deleted");
                    String deleteId= userInput.nextLine();
                    delete(deleteId);
                    if (delete(deleteId) == true){
                     System.out.println("Array after deletion");
                    print();   
                    } else{
                        System.out.println("Failed to delete student info");
                    }                    
                    break; 
                        
                case 4:
                    System.out.println("Please enter the name of the student to be updated");
                    String updateId = userInput.nextLine();
                    System.out.println("Enter updated student info");
                    temp = userInput.nextLine();
                    update(updateId,temp);
                    if (update(updateId,temp)==true){
                        System.out.println("New info " + temp);
                        System.out.println("Your student info is up to date");
                    } else {
                        System.out.println("Failed to update all student info");
                    }
                    break;

                case 5:
                    System.out.println("Sorted Student List");
                    print();
                    break;

                case 6:
                    break;
        }
    }
    
}
