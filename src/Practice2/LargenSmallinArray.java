package Practice2;

public class LargenSmallinArray {
public static void main(String[] args) {
		
	int a[]= {53,575,857,98,283, 988};
	int large=a[0];
	int small=a[0];
	
	for(int i=0; i<a.length; i++)
	{
		if(large<a[i])
		{
			large=a[i];
		}
		if(small>a[i])
		{
			small=a[i];
		}
	}
	 System.out.println("Max number in the array: " + large);
     System.out.println("Min number in the array: " + small);
	}

}
