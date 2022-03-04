package LinkedStudentListing;

import java.util.*;

public class LinkedStudentListing {
    private Node h;
    Scanner userInput = new Scanner(System.in);
    
    public LinkedStudentListing(){
        h = new Node();
        h.l = null;
        h.next = null;
    }
    public boolean insert(String newListing){
        Node n = new Node();
        if (n == null){
            return false;
        } else {
            n.next = h.next;
            h.next = n;
            return true;
        }
    }
    public Listing fetch (String targetKey){
        Node p = h.next;
        while(p != null && !(p.l.compareTo(targetKey) == 0)){
            p = p.next;
        }
        if(p != null){
            return p.l.deepCopy();
        } 
        return null;
    }
    public boolean delete(String targetKey){
        Node q = h;
        Node p = h.next;
        while(p != null  && !(p.l.compareTo(targetKey) == 0)){
            q = p;
            p = p.next;
        }
        if (p != null){
            q.next = p.next;
            return true;
        }else{
            return false;
        }
    }
    public boolean update(String targetKey, String newListing){
        if(delete(targetKey) == false){
            return false;
        }else if (insert(newListing) == false){
            return false;
        }
        return true;
    }
    public void showAll(){
        Node p = h.next;
        while(p != null){
            System.out.println(p.l.toString());
            p = p.next;
        }
    }
    public void choice(int n){
        LinkedStudentListing list = new LinkedStudentListing();
        switch (n){
                case 1:
                    System.out.println("Enter the new student information ");
                    String info = userInput.nextLine();
                    list.insert(info);
                    System.out.println("Operation complete");
                    break;
                case 2:
                    System.out.println("Enter the name of the student whos information is needed");
                    String searchId= userInput.nextLine();
                    if (list.fetch(searchId) != null) {
                        System.out.println(searchId + " exists on the list");
                        System.out.println("Operaton complete");
                    } else {
                        System.out.println("does not exist on the list");
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the student to be deleted");
                    String deleteId= userInput.nextLine();
                    if (list.delete(deleteId) == true){
                     System.out.println("Operation complete");
                    } else{
                      System.out.println("Failed to delete student info");
                    }                    
                    break; 
                        
                case 4:
                    System.out.println("Please enter the name of the student to be updated");
                    String updateId = userInput.nextLine();
                    System.out.println("Enter updated student info");
                    String newInfo = userInput.nextLine();
                    list.update(updateId,newInfo);
                    if (list.update(updateId, newInfo)==true){
                        System.out.println("Operation complete");
                    } else {
                        System.out.println("Failed to update all student info");
                    }
                    break;
                    
                case 5:
                    list.showAll();
                    break;
                    
                case 6:
                    break;
        }
    }
    public class Node {
        private Listing l;
        private Node next;
        public Node(){
        }
    }   
}

