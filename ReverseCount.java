import java.lang.*;
import java.util.*;
class ReverseCount
{
	public static void main(String[] args)
	{
		int vow=0;
		int con=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1; i>=0 ;i--)
		{
		 rev= rev+ str.charAt(i);
		}
		for(int i=0;i<str.length()-1;i++)
		{
			str=str.toLowerCase();
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
			{
				vow++;
			}
			else if(str.charAt(i)=='')
			{
			}
			else
			{
				con++;
			}
		
		}	
		System.out.print(" , the given string contains "+vow+"vowels and"+con+"consonants");
	}

}