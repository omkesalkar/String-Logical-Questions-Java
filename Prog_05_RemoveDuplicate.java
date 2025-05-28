package All_Logical_Questions.String;

import java.util.*;

public class Prog_05_RemoveDuplicate 
{
	public static String removeDuplicateChar(String str)
	{
		String result = ""; 
		
		for(int i=0; i<str.length(); i++)
		{
			int count = 0;
			if(str.charAt(i) != ' ') 
			{
				for(int j=i+1; j<str.length(); j++)
				{
					if(str.charAt(i)==str.charAt(j) && (i!=j))
					{
						count++;
					}
				}
				if(count == 0) 
				{
					result += str.charAt(i);
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.print("After removing duplicates: "+ removeDuplicateChar(str));
		
		sc.close();
	}
}
