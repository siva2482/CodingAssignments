package CodingAssingnment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FIndDay {
	
	@Test
	public void run()
	{
		String[] s={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		
		Map<String,Integer> hmap=new HashMap<String,Integer>();
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first day of the month");
		String day=sc.next();
		System.out.println("Enetr the number of days");
		int n=sc.nextInt();
		int num=n/7;
		int rem=n%7;
		String[] newday=new String[rem];

		for(String s1:s)
			hmap.put(s1, num);
		for(int i=0;i<s.length;i++)
		{
		   	if(s[i].equals(day))
		   	{
		   		for(int j=0;j<rem;j++)
		   		{
		   		newday[j]=s[i];
		   		i++;
		   		}
		   	}
		}
		for(String s1:newday)
		{
		if(hmap.containsKey(s1))
		{
		hmap.put(s1,hmap.get(s1)+1);
		}
		}
		for(Map.Entry m:hmap.entrySet())
		{
			System.out.println(m.getKey() +"  comes "+ m.getValue() +"   times ");
		}
		
	}

	
}
