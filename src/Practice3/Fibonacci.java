package Practice3;

public class Fibonacci {
public static void main(String[] args) {
	
	int a=0, b=1, sum=0;
	System.out.print("Fibonacci series are : "+ a +" "+b + " ");
	for(int i=0; i<10; i++)
	{
		sum=a+b;
		System.out.print(sum+ " ");
		a=b;
		b=sum;
	}
	



}

}
