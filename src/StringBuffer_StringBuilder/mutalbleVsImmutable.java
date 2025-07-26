package StringBuffer_StringBuilder;

import java.util.Arrays;

public class mutalbleVsImmutable {
public static void main(String[] args) {
		
	//Mutable
	int a[]= {20,5,10,50,65,35,25};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));

	//Immutable
	String s=new String("Welcome"); //Welcome
	System.out.println(s);

	s.concat("To java"); //Value only change if we declare the variable String b=s.concat("To java");
	
	System.out.println(s); //Welcome--- we can not change the original value

	}

}
