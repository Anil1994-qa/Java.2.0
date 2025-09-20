package Practice5;

public class SwapNum {
public static void main(String[] args) {
		
	int a=10, b=20;
	System.out.println("Numbers Before swapping :"+ a +","+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers After swapping :"+ a +","+ b);

	
	//using thired variable
	int d=10, e=20;
	int c=0;
	c=d;
	d=e;
	e=c;
	System.out.println("Numbers After swapping :"+ d +","+ e);
	
	}

}
