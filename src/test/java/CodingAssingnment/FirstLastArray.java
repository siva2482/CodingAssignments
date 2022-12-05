package CodingAssingnment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class FirstLastArray {
	
@Test
public void run()
{
	String[] s= {"A","B","c","D","E","F","G"};
	String s1="NOw I know my abc's";
	String s2="12345";
	String[] removeitem= {"D","E","F","G"};
	LinkedList<String> list=new LinkedList<String>(Arrays.asList(s));
	System.out.println(list);
	list.addLast(s1);
	System.out.println(list);
	list.addFirst(s2);
	System.out.println(list);
	
	list.remove("D");
	list.remove("E");
	list.remove("F");
	list.remove("G");
	
	System.out.println(list);
	list.remove("12345");
	System.out.println(list);
}
}

