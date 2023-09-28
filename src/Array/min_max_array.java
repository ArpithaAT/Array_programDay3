package Array;

import java.util.Scanner;

public class min_max_array {

	public static void main(String[] args) {
	   int i,n,min=0,max=0;
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("enter the total number of array");
	   n=sc.nextInt();
	   
	   int a[]=new int[n];
	   
	   System.out.println("enter the element f an array");
	   for(i=0;i<n;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   min=a[0];
	   max=a[0];
	   
	   for(i=0;i<n;i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	   
	   System.out.println("the largest number is:"+ max);
	   System.out.println("the smallest number is:"+ min);
	   
	   
	   

	}

}
