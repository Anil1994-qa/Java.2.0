package Practice4;

public class largeNuminArray {
public static void main(String[] args) {
	
	int[] arr = {8, 2, 9, 5, 6, 3, 7, 1};
	int large=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}
	}
	System.out.println("The large number in array is found :"+large);
	}

}
