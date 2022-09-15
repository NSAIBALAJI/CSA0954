import java.util.*;
public class fb
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		n=sc.nextInt();
		System.out.println("here the output!!!!");
		System.out.print("[ ");
		for(i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(" ,FizzBuzz, ");
			}
			else if(i%3==0)
			{
				System.out.print(" ,Fizz, ");
			}
			else if(i%5==0)
			{
				System.out.print(" ,Buzz,");
			}
			else
			{
				System.out.print(" ,"+i+", ");
			}
		}
		System.out.print(" ]");
	}
}
