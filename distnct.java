package loops;
import java.util.Scanner;

public class distnct {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      String result="";
      System.out.println("Enter the number of elements :");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements in the Array :");
      for(int i1 =  0; i1 < n; i1++) {
    	  arr[i1]=sc.nextInt();
      }
      
      for(int i1= 0;i1<n;i1++) {
    	   boolean isDistinct = true;
    	   for(int j = 0;j < i1;j++){
    		   if (arr[i1] == arr[j]) {
    			   isDistinct = false;
    			   break;
    		   }
    	   }
    	   if(isDistinct) {
    		   result+=arr[i1]+" ";
    	   }
      }
      
      System.out.println("Distinct elements in the Array :"  + result);
	}

}

