package All_Logical_Questions.String;

import java.util.*;

public class Prog_02_ReverseString2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String to Reverse: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		
		System.out.println("Reverse String: "+ sb);
		sc.close();
	}
}
