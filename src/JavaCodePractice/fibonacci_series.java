 package JavaCodePractice;

public class fibonacci_series {
public static void main(String[] args) {
	/*
	 * Adds a + b to get the next number
      Prints the sum
      Then shifts the values:                
      a = b
      b = sum
     This allows the series to move forward.
	 
	 */
		
	int a=0, b=1, sum=0;
	System.out.print("Fibonacci Series: " + a + " " + b + " ");
	for(int i=1; i<10; i++)
	{
		sum=a+b; 
		System.out.print(sum + " ");
		a=b;
		b=sum;
	}
	
	}

}
