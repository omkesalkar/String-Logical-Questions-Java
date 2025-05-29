package All_Logical_Questions.String;
import java.util.*;

public class Prog_06_CountOccurance
{
	public static void countOccuranceOfChar(String str)
	{
		String result = "";
		
		char[] arr = new char[str.length()];
		int c = 0;
		
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
				
				if(count == 1)
				{
					arr[c++] = str.charAt(i);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) 
		{
			int count2=0;
			
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' &&arr[i]<='Z')) 
			{
				for(int j=0;j<str.length();j++) 
				{
					if(arr[i]==str.charAt(j)) 
					{
						count2++;
					}
				}	
				
				System.out.println(result += arr[i]+" : "+count2+"\n");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		countOccuranceOfChar(str);
		
		sc.close();
	}
}
