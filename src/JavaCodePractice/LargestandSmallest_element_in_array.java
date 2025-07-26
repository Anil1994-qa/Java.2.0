package JavaCodePractice;

public class LargestandSmallest_element_in_array {
public static void main(String[] args) {

		int a[]= {10,20,30,10,60,2000,3846,3836,9474,9384};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
			min=a[i];	
			}
		}
		 System.out.println("Max number in the array: " + max);
	     System.out.println("Min number in the array: " + min);
	}

}
