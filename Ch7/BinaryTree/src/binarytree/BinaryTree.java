package binarytree;

import BinaryTree.Listing;
import java.util.*;


public class BinaryTree {
    private Listing[] bt;
    private int size, next;
    public String sortedlist[];
    public Listing list = new Listing();
    Scanner userinput = new Scanner(System.in);
    
    public BinaryTree(){
        next = 0;
        size = 100;
        bt = new Listing[size];
    }
    
    public BinaryTree(int s){
        next = 0;
        size = s;
        bt = new Listing[size];
    }
    
    public boolean insert(Listing sl){
        if(next >= size){
            bt[next]=sl.deepCopy();
            return false;
        }
        if(bt[next] == null){
            bt[next] = sl.deepCopy();
            next = next +1;
            return false;
        }
        return true;
    }
    
    public Listing fetch(String targetKey){
        Listing listing, temp;
        int i=0;
        while(i<next && !(bt[i].compareTo(targetKey) ==0)){
            i++;
        } 
        if (i == next){
            return null;
        }
        listing = bt[i].deepCopy();
        return listing;
    }
    
    public boolean delete(String targetKey){
        int i=0;
        while(i<next && !(bt[i].compareTo(targetKey) ==0)){
            i++;
        } 
        if (i == next){
            return false;
        }
        bt[i] = bt[next-1];
        bt[next-1]= null;
        next = next-1;
        return true;
    }
    public boolean update(String targetKey, Listing listing){
        if(delete(targetKey) == false){
            return false;
        }else if(insert(listing)== false){
            return false;
        } else
            insert(listing);
            return true;
    }

   public void sort(Listing[] a) {
        Listing temp;

        for(int j = 0; j < a.length - 1; j++) {
            for(int i = j + 1; i < a.length; i++) {
                if(a[j].getName().compareTo(a[i].getName()) > 0) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for(int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
   }

    public void showAll(){
        Listing templist[] = new Listing[next];
        for(int i= 0; i < next; i++){
            templist[i]=bt[i];
        }
        sort(templist);
    }
    public void showOne(Listing listing) {
        System.out.println(listing.toString());
    }
    public void choice(int n){
    switch (n){
                case 1:
                    list.input();
                    insert(list);
                    break;
                case 2:
                    System.out.println("Enter the name of the student whos information is needed");
                    String targetKey= userinput.nextLine();
                    Listing listing = fetch(targetKey);
                    if(listing != null) {
                        showOne(listing);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the student to be deleted");
                    targetKey= userinput.nextLine();
                    delete(targetKey);                   
                    break; 
                        
                case 4:
                    System.out.println("Please enter the name of the student to be updated");
                    targetKey = userinput.nextLine();
                    list.input();
                    update(targetKey, list);
                    break;
                    
                case 5:
                    System.out.println("Sorted student info: ");
                    showAll();
                    break;
                    
                case 6:
                    break;
                }
    }
}
