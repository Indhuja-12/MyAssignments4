package week4.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords
{

	public static void main(String[] args) 
	{
		String text="We learn java basics as part of java sessions in java week1";
		String[] arr = text.split(" ");
		Set<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		for (String ss : set)
		{
			System.out.print(ss+" ");
		}	
	}
}
		
		
	

	