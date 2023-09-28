package Array;

public class seperate_even_odd {

	public static void main(String[] args) {
		
		int a[]= {10,11,14,15,18,19};
		
		
		int i;
		System.out.println("even number are:");
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("odd number are:");
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				if(a[i]%2==1)
				{
					System.out.println(a[i]);
				}
			}
		}
          
	}

}
