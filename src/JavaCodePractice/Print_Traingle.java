package JavaCodePractice;

public class Print_Traingle {
public static void main(String[] args) {
		
	for(int i=0; i<5; i++) //This is for rows
	{
		for(int j=0; j<=5-i; j++) // This is for spaces
		{
			System.out.print(" ");		
		}
		for(int k=1; k<=2*i-1; k++) // This is for printing stars
		{
			System.out.print("*");
		}
		System.out.println();

	}

	}

}
