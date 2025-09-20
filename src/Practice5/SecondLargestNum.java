package Practice5;

public class SecondLargestNum {
public static void main(String[] args) {
		
	int a[]={2, 3, 5,74,72,84,94,84};
	int first=a[0];
	int second=a[0];
	for(int i=1; i<a.length; i++)
     {
		if(a[i]>first)
		{
			second=first;
			first=a[i];
		}
		else if(a[i]>second)
		{
			a[i]=second;
		}
     }
           System.out.println("Second large Number is :"+second);
	}

}
