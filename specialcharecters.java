import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		String m;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;	
		sc= new Scanner(System.in);
		System.out.print("enter the Special String =  ");
		m = sc.nextLine();
		for(i = 0; i < m.length(); i++)
		{
			ch = m.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}
