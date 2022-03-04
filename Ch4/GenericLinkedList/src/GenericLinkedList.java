public class GenericLinkedList <T> {
    private Node<T> h;
    public GenericLinkedList(){
        h = new Node<T>();
        h.data = null;
        h.next = null;
    }
    public boolean insert(T data){
        Node<T> n = new Node<T>(data);
        if (n == null){
            return false;
        } else {
            n.next = h.next;
            h.next = n;
            return true;
        }
    }
    public T fetch (T targetKey){
        Node <T> p = h.next;
        while(p != null && !(p.data.equals(targetKey))){
            p = p.next;
        }
        if(p != null){
            return p.data;
        } 
        return null;
    }
    public boolean delete(T targetKey){
        Node q = h;
        Node p = h.next;
        while(p != null  && !(p.data.equals(targetKey))){
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
    public boolean update(T targetKey, T newEntry){
        if(delete(targetKey) == false){
            return false;
        }else if (insert(newEntry) == false){
            return false;
        }
        return true;
    }
    public void showAll(){
        Node p = h.next;
        while(p != null){
            System.out.println(p.data.toString());
            p = p.next;
        }
    }
    public class Node<T> {
        private T data;
        private Node next;
        public Node(T data){
         this.data = data;
         next = null;
        }
        public Node(){
            data = null;
            next = null;
        }
    }   
}

