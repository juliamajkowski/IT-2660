/*
-Generate a graph with at least 1000 nodes, where each node randomly has between 1 and 5 connections to other nodes.
-Each node should contain within it a random value between 1 and 100,000.
-Allow the user to enter a number to search for, and implement both of the following types of searching algorithms.
Breadth-First. (40 points)
Depth-First. (40 points)
Dijkstra's Algorithm. (40 points extra credit - optional) 
-Do not allow back-tracking in your searches. (Mark nodes that you already searched as complete, and do not re-visit them in the same search)
-Each search should return the following:
-The Success/Failure of your search.
-The length of the shortest path to the found node.
-The total number of nodes examined during the search.
*/
import java.util.*;

public class GraphDriver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100000;
        Random rand = new Random();
        Graph numGraph = new Graph(1000);
       int count = 0;
       for(int i = 0; i< 1000; i++){
           int n = rand.nextInt((max - min) + 1) + min;
           numGraph.insertVertex(i, new Node(n));
       }
       while (count <= 5){
         for (int j=0; j<1000;j++){
           int nmax = 1000;
           int m = rand.nextInt(nmax);
           int l = rand.nextInt(nmax);
           numGraph.insertEdge(j,l);
           numGraph.insertEdge(m, l);
           count++;
        }  
       }
       
       for(int k=0; k<1000;k++){
           System.out.print("The " + k + " vertex is ");
           numGraph.showVertex(k);
           System.out.println("Its edges are: ");
           numGraph.showEdges(k);
       }
       System.out.println("Enter a number to search for: ");
       int e = input.nextInt();
       System.out.println("The breadth first traversal order is :");
       numGraph.BFT(e);
       System.out.println("\nThe depth first traversal order is: ");
       numGraph.DFT(e);
       System.out.println("\nThe shortest path to get to " + e + " was: ");
       numGraph.path();
    }
}
