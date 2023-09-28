package Array;

import java.util.Scanner;

public class delete_specific_num {

	public static void main(String[] args) {
		
		int a[]= {10,11,12,13,14,15};
		int i,position = 0,delitem,f=0;
		int temp[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the elemnt you want to delete");
		delitem=sc.nextInt();
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]==delitem)
			{
				position=i;
				f=1;
			}
		}
            if(f==1)
            {
            	for(i=0;i<a.length-1;i++)
            	{
            		if(i<position)
            		{
            			temp[i]=a[i];
            		}
            		if(i>=position)
            		{
            			temp[i]=a[i+1];
            		}
            	}
            	
            	System.out.println("element deleted successfully !!");
                System.out.println("Array after deleting the element");
                for(i=0;i<temp.length;i++)
                {
                	System.out.println(temp[i]);
                }
                }
	}

}
