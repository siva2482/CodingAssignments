package CodingAssingnment;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class printWord {
	
	public static String  capString(String s)
	{
		String s1="";
		for(int i=0;i<s.length();i+=2)
		{
   s.replace(String.valueOf(s.charAt(i)),"");
				
		}
		
	for(int i=1;i<s.length();i+=2)
	{
		if(Character.isUpperCase(s.charAt(i)))
				
		s1=s1+s.charAt(i);	
		else
		{
			s1=s1+s.charAt(i);
			s1=s1.toUpperCase();
		}
	

	}
	return s1;
	}
	
	@Test
	public void  run()
	{
		String s="AHCECLWLXO";
		String s2="ahceclwlxo";
		String s1=capString(s2);
		System.out.println(s1);
		Assert.assertEquals("HELLO",s1);
		
				}
}
