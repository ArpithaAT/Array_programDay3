package Array;

public class remove_repeated_ele {

	public static void main(String[] args) {

		int a[]= {1,1,2,2,3,3,4,4,5,5,6,6};
		int i,j,k;
		int size=a.length-1;

		for(i=0;i<size;i++)
		{
			for(i=0;i<size;i++)
			{
				for(j=i+1;j<size;j++)
				{
					if(a[i]==a[j])
					{
						for(k=j;k<size;k++)
						{
							a[k]=a[k+1];
						}
						size--;
					}
						else
						{
							j++;
						}
					}
				}
			System.out.println("After removing repeated element array is: ");
		    for(i=0;i<size;i++)	
		    {
		    	System.out.println(a[i]);
		
		}
		}

	}

}
