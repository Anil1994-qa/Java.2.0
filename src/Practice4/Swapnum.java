package Practice4;

public class Swapnum {
public static void main(String[] args) {
	
	int a=10;
	int b=20;
	
	System.out.println("Numbers before Swapping :"+ a +"," + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers after Swapping :"+ a +","+ b);

	}

}
