package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateSet {

	public static void main(String[] args) 
	{
		String name="google";
		char[] charArray = name.toCharArray();
		Set<Character>Set=new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) 
		{
			Set.add(charArray[i]);
		}
		System.out.println(Set);
	}

}
