package week4.day1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumberSet 
{

	public static void main(String[] args) 
	{
		int[] a = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			if(set.add(a[i])==false) 
			{
				System.out.println("The duplicate number:"+" "+a[i]);
			}
		}

	}

}
