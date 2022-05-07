public class Node {
    
    private int random;
    boolean pushed;
   
    public Node(int r){
        random = r;
    }
    public String toString(){
        return(""+ random);    
    }
    public Node deepCopy(){
        Node clone = new Node(random);
        return clone;
    } 
    public boolean getPushed(){
        return pushed;
    }
    public void setPushed(boolean value){
        pushed = value;
    }
}
