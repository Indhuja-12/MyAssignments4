package week4.day1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	private static char[] charArray;

	public static void main(String[] args) 
	{
		String str="hiyaviyan";
		 char[] ch = str.toCharArray();
		 Set<Character> set=new TreeSet<Character>();
		 for (int i = 0; i < ch.length; i++) 
		 {
			set.add(ch[i]);
		 }
		 List<Character> list=new LinkedList<Character>(set);
		 for (int i = 0; i < list.size(); i++) 
		 {
			int c=0;
			for (int j = 0; j < ch.length; j++) 
			{
				if(list.get(i)==ch[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.print(list.get(i));
			}
		 }
		

	}

}
