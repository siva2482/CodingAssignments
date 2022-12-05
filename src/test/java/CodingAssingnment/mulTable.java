package CodingAssingnment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class mulTable {
	
	@Test
	public void run()
	{
	for(int i=-15;i<=10;i++)
	{
		System.out.print(i);
		
	}
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER FOR MULTIPLICATION TABLE");
	int x=sc.nextInt();

	for(int i=1;i<=20;i++)
	{
		int result=i*x;
		System.out.print(result +" ");
	}
	
	}

}
