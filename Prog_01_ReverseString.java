package All_Logical_Questions.String;
import java.util.*;
/*
	1. Write a program to print the reverse of the String?
	Ex: Nacre Output: ercaN
*/

public class Prog_01_ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String to Reverse: ");
		String str = sc.nextLine();
		
		System.out.print("Reverse String: ");
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		sc.close();
	}
}
