import java.io.*;
import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		char n;
		Scanner sc=new Scanner(System.in);
		n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		System.out.println("vowel");
		
		else
		System.out.println("consonant");
	}
	
}
