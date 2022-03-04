public class GenericListDriver {

   public static void main(String[] args) {
        GenericLinkedList list = new GenericLinkedList();
        GenericLinkedList numList = new GenericLinkedList();
        
        list.insert("a,b,c");
        list.insert("d,e,f");
        System.out.println("List:");
        list.showAll();
        if (list.fetch("d,e,f") != null) {
                  System.out.println("exists on the list");
            } else {
                  System.out.println("does not exist on the list");
            }
        list.delete("d,e,f");
        System.out.println("List:");
        list.showAll();
        list.update("a,b,c", "x,y,z");
        System.out.println("List:");
        list.showAll();
        
        numList.insert(123);
        numList.insert(456);
        System.out.println("List:");
       numList.showAll();
        if (numList.fetch(456) != null) {
                  System.out.println("exists on the list");
            } else {
                  System.out.println("does not exist on the list");
            }
        numList.delete(456);
        System.out.println("List:");
        numList.showAll();
        numList.update(123, 789);
        System.out.println("List:");
        numList.showAll();
    }
    
}
