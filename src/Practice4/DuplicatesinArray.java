package Practice4;

public class DuplicatesinArray {
public static void main(String[] args) {

	int a[]= {4, 5, 6, 4, 7, 5, 8};
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				 System.out.print(a[i] + " ");
                 break;
			}
		}
	}
	
	}

}
