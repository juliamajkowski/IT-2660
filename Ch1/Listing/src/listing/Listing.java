package listing;
import java.util.Scanner;
public class Listing {

private String name;
private int age;

public Listing(){
    name = "";
    age = 0;
}
public  Listing(String n, int a){
    name = n;
    age = a;
}
public void Input(){
 Scanner userInput = new Scanner(System.in);
 
 System.out.println("Enter a name: ");
   name = userInput.next();
 System.out.println("Enter an age: ");
   age = userInput.nextInt();

}
public String toString(){
    String str = name + " is " + age + " years old.";
    return str;
}
public void setName(String n){
    name = n;
}
    
public String getName(){
    return name;
}
public void setAge(int a){
    age = a;
}
public int getAge(){
    return age;
}
}
 



