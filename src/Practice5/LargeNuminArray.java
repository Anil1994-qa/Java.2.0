package Practice5;

public class LargeNuminArray {
public static void main(String[] args) {

	int a[]={2, 3, 5,74,72,84,94,84};

	int large=a[0];
	for(int i=1; i<a.length; i++)
	{
		if(a[i]>large)
		{
		  large=a[i];
		}
	}
	System.out.println(large);

	}

}
