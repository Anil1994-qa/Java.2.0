package Practice;

public class UppernLowerCaseinString {
public static void main(String[] args) {
		
	String s="I am Learing java And Selenium Automation";
	int upper=0;
	int lower=0;
	for(char words:s.toCharArray())
	{
		if(Character.isUpperCase(words))
		{
			upper++;
		}
		if(Character.isLowerCase(words))
		{
			lower++;
		}
	}
	System.out.println("Upper Characters : "+upper);
	System.out.println("Lower Characters : "+lower);

	}

}
