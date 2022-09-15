import java.util.*;
public class vc
{
	public static void main(String[] args) 
	{
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the sentense: ");
		s=sc.nextLine();
		System.out.print("Vowels= ");
		for(i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				c++;
				System.out.print(a+" ");
			}
		}
		System.out.println();
		System.out.print("Consonants= ");
		for(i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			{
				c++;
			}
			else
			{
				System.out.print(a+" ");
			}		
		}
	}
}
