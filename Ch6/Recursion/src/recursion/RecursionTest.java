package recursion;

import java.util.*;

/*Implement a Top Down Recursive Merge Sort in the language of your choice.
Demonstrate that your sort works by generating a random sequence of 100 numbers, 
printing them in their raw unsorted form, sorting them,and then printing them out in their sorted order.*/
public class RecursionTest {
    public static int[] intList(){
       Random random = new Random();  
        int list[] = new int[100];
    
       for (int i=0; i <100; i++){
           list[i] = random.nextInt(100); 
       }
       System.out.print("Unsorted list: " + Arrays.toString(list));
       return list;
    }
    public static void main(String[] args){ 
        TopDownMergeSort test = new TopDownMergeSort();
        test.sort(intList());
        
    }
    
}
