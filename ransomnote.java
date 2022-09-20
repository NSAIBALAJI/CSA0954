import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class ransom {
 
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		int l1 = ransomNote.length();
		
		int l2 = magazine.length();
		
		if (l1 != l2)
			
			return false;
		
		char[] ransomNoteChars = ransomNote.toCharArray();
		for (char charOfransomNote : ransomNoteChars) {
			
			if (magazine.contains(Character.toString(charOfransomNote)))
		 
				magazine = magazine.replaceFirst(Character.toString(charOfransomNote), "");
			else
				
				return false;
		}
		
		return true;
 
	}
 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String q,z;
		System.out.print("Enter string1= ");
		q=sc.nextLine();
		System.out.print("Enter string2= ");
		z=sc.nextLine();
		System.out.println(canConstruct(q,z));
		
 
	}
 
}
