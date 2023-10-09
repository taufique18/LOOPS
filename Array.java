package loops;

import java.util.Scanner;

public class Array {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number you want to enter: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("ENter The Number:");
		for (i=0;i<n;i++) {
			num[i]=sc.nextInt();
			
		}
		int m=num[0];
		for (i=1;i<num.length;i++) {
			if(num[i]>m) {
				m=num[i];
			}
		}
		System.out.println("LARGEST NUMBER IS:"+m);
		
	}

}
