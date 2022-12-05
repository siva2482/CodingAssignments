package CodingAssingnment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class printNumber {
	
	public static void printPrime(int n,int y)
	{
		
		System.out.println("The prime  umbers are: ");
		for(int i=n;i<y;i++)
		{
			boolean prime=false;
			//System.out.println(i);
			for(int j=2;j<i;j++)
			{
				int r=i%j;
				if(r==0)
				{
					prime=true;
					break;
				}
					
			}
			if(!prime)
				System.out.println(i);
		}
	}
	public static void fibno(int y)
	{
		 int r=1;
		for(int i=y;i>=1;i--)
		{
			r=r*i;
			System.out.print(i+"*");
			
		}
		System.out.println( " is " +r);
	}
	
	@Test
	public void arun()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x=sc.nextInt();
		System.out.println("Enetr the second number: ");
		int y=sc.nextInt();
		printPrime(x,y);
		
	}
	@Test
	public void brun()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find fibnocci: ");
		int x=sc.nextInt();
		fibno(x);
	}

}
