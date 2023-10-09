package loops;

import java.util.Scanner;

public class maxdiff {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i;
			Scanner sc = new Scanner(System.in);
		    System.out.println("How many numer you want to enter ?");
		    
		    int n = sc.nextInt();
		    int[] num  = new int[n];
		    System.out.println("Enter the number:");
		    for(int i1 = 0;i1<n;i1++) {
		    	num[i1] = sc.nextInt();
		    }
			int l = num[0];
			
			
			int s = num[0];
			for(i=1;i<num.length;i++) {
				if(num[i]>1) {
					l = num[i];
					
				}
				else if(num[i]<s) {
					s=num[i];
					
				}
				
			}
		    int maxdiff = l-s;
		    System.out.println("The smallest Element is :" + s);
		    System.out.println("Largest Element is :" + l);
		    System.out.println("Maximum Difference:" + maxdiff);
		    
		    
			}

		
	}


