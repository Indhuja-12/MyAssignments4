package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberSet 
{
	public static void main(String[] args) 
		{
		int[] a = {2,4,1,5,7,8,0};
		missingNumbers(a);//3,6
		}

	private static void missingNumbers(int[] a) 
	{
		Set<Integer>set=new HashSet<Integer>();
		for(int num:a) {
			set.add(num);
		}
		int n=a.length+1;
		for (int i = 0; i <n; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
			
		}
		
	}
}

	      

	

	
	