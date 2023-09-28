package Array;

import java.util.Scanner;

public class p5_element_into_array {

	public static void main(String[] args) {
		int a[]= {9,6,5,4,3,2};
		int temp[]= new int[7];
		
		int i,p,insitem;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element you wants to insert");
		insitem=sc.nextInt();
		
		System.out.println("enter position of an element to be inserted ");
		p=sc.nextInt();
		
		p=p-1;
		
		for(i=0;i<=a.length;i++)
		{
			if(i<p)
			{
				temp[i]=a[i];
			}
			if(i>p)
			{
				temp[i]=a[i-1];
			}
			
			if(i==p)
			{
				temp[i]=insitem;
			}
		}
		
		System.out.println("After insertion Array is : ");
		
		for(i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
		
	}
}
