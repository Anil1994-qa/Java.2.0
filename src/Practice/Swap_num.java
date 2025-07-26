package Practice;

public class Swap_num {
public static void main(String[] args) {
		
	int a=20, b=10;
	
	System.out.println("Numbers Before Swapping :" +a+" "+b);
	//Using third variable
	int c=0;
	c=a;
	a=b;
	b=c;
	System.out.println("Numbers After Swapping :" +a+" "+b);
	//Approach 2 using + and - Operator
	int a1=20, b1=10;
	System.out.println("Numbers Before Swapping :" +a1+" "+b1);
	a1=a1+b1; //30
	b1=a1-b1; //10
	a1=a1-b1; //20
	System.out.println("Numbers After Swapping :" +a1+" "+b1);

	}

}
