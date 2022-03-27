package recursion;

import static java.awt.PageAttributes.MediaType.A;
import java.util.*;

public class TopDownMergeSort {
   int sortedlist[] = new int[100];
   
   public int[] merge(int[] result, int[] a, int[] b)
   {
      int i, j, k;

      i = j = k = 0;

      while ( i < a.length || j < b.length )
      {
	 if ( i < a.length && j < b.length )
	 {  
	    if ( a[i] < b[j] )
	       result[k++] = a[i++];
	    else
	       result[k++] = b[j++];
	 }
	 else if ( i == a.length )
	    result[k++] = b[j++];     
	 else if ( j == b.length )
	    result[k++] = a[i++];  
      }
      return sortedlist = result;
   }
    
  public void sort(int[] a){
      int[] left, right;
      //base case
      if (a.length == 1) return;
      //recursion
      int m = a.length/2;
      left = new int[m];
      for(int i = 0; i < m; i++){
          left[i]=a[i];
      }
      right = new int[a.length-m];
      for(int j = 0; j<a.length-m; j++){
          right[j] = a[j+m];
      }
      sort(left);
      sort(right);
      merge(a,left,right);
      
      //implementation
      System.out.println("Sorted list: " + Arrays.toString(sortedlist));
  }
  
  
}
