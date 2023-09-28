package Array;

public class reverse__of_array {

	public static void main(String[] args) {
		
	  int a[]= {1,2,3,4,5};
	  int i=0;
	  System.out.println("before reversing");
	  for(i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	 
	  System.out.println("after reversing");
	  for(i=a.length-1;i>=0;i--)
	  {
		  System.out.println(a[i]);
	  }

	}

}
