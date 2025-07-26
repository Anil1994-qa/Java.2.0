package JavaCodePractice;

public class MiddelnumEvenODD {
public static void main(String[] args) {
		
	long num=123456789;
	String str=Long.toString(num);
	int length=str.length()/2;
	char middelnumber=str.charAt(length);
	int middeldigit=Character.getNumericValue(middelnumber);
	System.out.println("Middel digit is :"+middeldigit);
	if(middeldigit/2==0)
	{
		System.out.println("Middel digit is Even number:"+middeldigit);
	}
	else
	{
		System.out.println("Middel digit is ODD number:"+middeldigit);
	}
	
	
	}

}
