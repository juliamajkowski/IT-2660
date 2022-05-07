import java.util.*;
public class Graph {
    Node vertex[];
    int edge[][];
    int max, numOfVertices,V,p, lengthA, lengthB;
    boolean flag= false;
    Random rand = new Random();
    int firstVertex = rand.nextInt(1000);
    
    public Graph(int n){
        vertex = new Node[n];
        edge = new int[n][n];
        V = n;
        numOfVertices = 0;
    }
    public void BFT (int s){
        int v;
        int counter =0;
        Queue<Integer> queue = new LinkedList();
        boolean visited[] = new boolean[V];
        for(int i = 0; i <numOfVertices; i++){
            if(vertex[i] != null)
                visited[i] = false;
        }
        visited[firstVertex] = true;
        queue.add(firstVertex);
        
        while(queue.size() !=0){
           
           v = queue.poll();
           System.out.print(v+" ");
           String str = vertex[v].toString();
           int st = Integer.parseInt(str);
           if( st == s){
                    counter++;
                    p = v;
                    flag=true;
                    break;
                } else{
                    counter++;
                    flag = false;
                }
           for(int c = 0; c < numOfVertices; c++){
               if(!visited[c]){
                   visited[c]=true;
                   queue.add(c);
               
               }
               
           }
        }
        if (flag == true){
               System.out.println("\nSearch successful. The value "+ s+ " was found at vertex " + p);
           } else{
               System.out.println("\nSearch not successful. The value "+ s+ " was not found");
           }
        System.out.println("The number of nodes visited during the search was " + counter);
        lengthB=counter;
    }
     public void DFT(int s){
        int v;
        int counter =0;
        Stack<Integer> stack = new Stack();
        boolean visited[] = new boolean[V];
        
        stack.push(firstVertex);
        visited[firstVertex] = true;
        
        while(!stack.empty()){
           v = stack.pop();
           System.out.print(v+" ");
           String str = vertex[v].toString();
           int st = Integer.parseInt(str);
           if( st == s){
                    counter++;
                    p = v;
                    flag=true;
                    break;
                } else{
                    counter++;
                    flag = false;
                }
            for(int c = 0; c < numOfVertices; c++){
               if(!visited[c]){
                   visited[c]=true;
                   stack.push(c);                
                }   
           }
        }
        if (flag == true){
               System.out.println("\nSearch successful. The value "+ s+ " was found at vertex " + p);
           } else{
               System.out.println("\nSearch not successful. The value "+ s+ " was not found");
           }
       System.out.println("The number of nodes visited during the search was " + counter);
       lengthA = counter;
    }
    public void path(){
        int path =0;
        if (lengthA<lengthB)
             path = lengthA;
        else if(lengthB < lengthA)
             path = lengthB;  
       System.out.println(path + " nodes long");
    } 
    public boolean insertVertex(int vertexNum, Node newNode){
        if(vertexNum >= V)
            return false;
        vertex[vertexNum] = newNode.deepCopy();
        numOfVertices++;
        return true;
    }
    public boolean insertEdge(int fromVertex, int toVertex){
        if(vertex[fromVertex] == null || vertex[toVertex] == null)
            return false;
        edge[fromVertex][toVertex] = 1;
        return true;
    }
    public void showVertex(int vertexNum){
        System.out.println(vertex[vertexNum]);
    }
    public void showEdges(int vertexNum){
        for(int c = 0; c < numOfVertices; c++ ){
            if(edge[vertexNum][c] == 1)
                System.out.println(vertexNum + "," + c);
        }
    }
   
}