package CodingAssingnment;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class randomnumber {
	
	@Test
	public void run()
	{
		Random rand=new Random();
		int i=rand.nextInt(1,10);
		System.out.println(i);;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you guess: ");
		int j=sc.nextInt();
		if(j<i)
		{
			System.out.println("Your guess is lower than the number generated");
			
		}else if(j>i)
		{
			System.out.println("Your guess is bigger than the number generated");
			
		}
		else
		{
			System.out.println("your guess is corrct");
		}
		
		System.out.println("Enetr a character or number");
		char s=sc.next().charAt(0);
		if(Character.isAlphabetic(s)){
			System.out.println(s +"is An alphabet");
			
		}
		if(Character.isDigit(s))
		{
			System.out.println(s +"is numeric");
				
		}
		
	}
	

}
