question 1
import java.util.*;
public class alphaord
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the no. of names:  ");
		n=sc.nextInt();
		String names[]=new String[n];
		System.out.println("Enter names:  ");
		for(i=0;i<n;i++)
		{
			names[i]=s.nextLine();
			if(names[i]!= null && names[i].matches("^[a-zA-Z]*$"))
			{
				System.out.print("");
			}
      		else
			{
         			System.out.println("Invalid");
				return;
			}
		}
		String temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{	
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}	
			}
		}
		System.out.println("In order: ");
		for(i=0;i<n;i++)
		{
				System.out.println(names[i]);
		}
	}
}

question 2
import java.util.*;
public class pattern
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		int n,i,j,k;
		System.out.print("Enter the rows: ");
		n=sc.nextInt();
		char a[]=new char[n];
		System.out.print("Charecter: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.next().charAt(0);
		}
		System.out.println("Pattern: ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}

question 3
import java.util.Scanner;  
public class perfect
{  
public static void main(String args[])    
{  
long n, sum=0;  
Scanner sc=new Scanner(System.in);         
System.out.print("Enter the number: ");  
if(!sc.hasNextLong())
{
System.out.print("Invalid");
	return;
}
n=sc.nextLong();  
int i=1;  

while(i <= n/2)  
{  
if(n % i == 0)  
{  
 
sum = sum + i;  
} 

i++;  
} 

if(sum==n)  
{  

System.out.println(n+" is a perfect number.");  
} 
else  

System.out.println(n+" is not a perfect number.");   
}  
}

question 4
import java.util.*;
interface PI1 {
    default void show()
    {
	Scanner sc=new Scanner(System.in);
	int x;
        System.out.println("Enter Base x: ");
	x=sc.nextInt();
	 System.out.println("Base x=  "+x);
    }
}
interface PI2 {
    default void show()
    {
 
        Scanner sc=new Scanner(System.in);
		int y,x;
        System.out.println("Enter Derived y: ");
		y=sc.nextInt();
	System.out.println("Derived y=  "+y);
    }
}
class override implements PI1, PI2 {
    public void show()
    {
        PI1.super.show();
        PI2.super.show();
    }
    public static void main(String args[])
    {
        override d = new override();
        d.show();
    }
}
question 5
import java.io.*;
import java.lang.*;
import java.util.*;
 
class one 
{
    public void print_name()
    {
		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter name: ");
		String a=sc.nextLine();
    }
}
 
class two extends one 
{
    public void print_roll() 
    {
    		Scanner sc=new Scanner(System.in);
        	System.out.print("Enter roll no.: ");
		int n=sc.nextInt(); 
    }
}
 
class three extends two 
{
    public void print_mark()
    {
        Scanner sc=new Scanner(System.in);
		double to,p,c,m;
		System.out.print("Enter the python marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		p=sc.nextDouble();
		System.out.print("Enter the c programming marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		c=sc.nextDouble();
		System.out.print("Enter the Maths marks: ");
		if(!sc.hasNextInt())
        	{
            	System.out.println("Invalid");
           		return;
        	}
		m=sc.nextDouble();
		to=p+c+m;
		System.out.print("Total marks= "+to);
    }
}
public class totalmark 
{
    public static void main(String[] args)
    {
        three g = new three();
        g.print_name();
        g.print_roll();
        g.print_mark();
    }
}

question 6
import java.util.*;
public class digits
{
	public static void main(String[] args)
	{
		int x,c=0,re;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		if(!sc.hasNextInt())
		{
			System.out.print("Number of digits is: Error ");
			return;
		}
		x=sc.nextInt();
		if(x==0)
		{
			System.out.print("Number of digits are 1");
			return;
		}
		while(x!=0)
		{
			re=x%10;
			c++;
			x=x/10;
		}
		System.out.print("Number of digits are "+c);
	}
}

question 7
import java.util.*;
class rep 
{
	static int longestUniqueSubsttr(String s)
  	{
    		HashMap<Character, Integer> seen = new HashMap<>(); 
    		int maximum_length = 0;
    		int start = 0;
    		for(int end = 0; end < s.length(); end++)
    		{
      		if(seen.containsKey(s.charAt(end)))
      		{
        			start = Math.max(start, seen.get(s.charAt(end)) + 1);
      		}
 			seen.put(s.charAt(end), end);
     			maximum_length = Math.max(maximum_length, end-start + 1);
    		}
    		return maximum_length;
  	}
	public static void main(String []args)
  	{
    		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		s=sc.nextLine();
    		System.out.println("The input String is " + s);
    		int length = longestUniqueSubsttr(s);
    		System.out.println("The length of the longest non-repeating character substring is " + length);
  	}
}

question 8
import java.util.*;
public class factors
{
	public static void main(String[] args)
	{
		int x,i,c=0,n;
		List<Integer> posi = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number: ");
		n=sc.nextInt();
		System.out.print("N: ");
		x=sc.nextInt();
		if(n<0)
		{
			n=-1*n;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;		
					posi.addAll(Arrays.asList(i*-1));
				}	
			}
		}
		else
		{
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;		
					posi.addAll(Arrays.asList(i));
				}	
			}
		}
		System.out.println("Number of factors= "+c);
		System.out.println("Factors = "+posi);
		if(x==0)
		{
			System.out.println("Invalid N");
			return;
		}
		if(x>c)
		{
			System.out.println("Invalid N it only consists of "+c+" factors");
			return;
		}
		System.out.println(x+" factor of "+n+" = "+posi.get(x-1));
	}
}

question 9
class weekrow {
    public int[] kWeakestRows(int[][] M, int K) {
        int y = M.length, x = M[0].length;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        int[] ans = new int[K];
        for (int i = 0; i < y; i++) {
            heap.add(-(find(M[i]) << 7) - i);
            if (heap.size() > K) heap.remove();
        }
        while (heap.size() > 0)
            ans[heap.size()-1] = -heap.remove() & (1 << 7) - 1;
        return ans;
    }
    int find(int[] row) {
        int x = row.length;
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + right >> 1;
            if (mid < x && row[mid] > 0) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
question 10
import java.util.*;
interface GPI 
{
	default void show()
	{
		Scanner sc=new Scanner(System.in);
		double ch,et,to,p,c,m,ph,a;
		System.out.print("Enter the python marks: ");
		p=sc.nextDouble();
		System.out.print("Enter the c programming marks: ");
		c=sc.nextDouble();
		System.out.print("Enter the Maths marks: ");
		m=sc.nextDouble();
		System.out.print("Enter the Physics marks: ");
		ph=sc.nextDouble();
		System.out.print("Enter the Chemistry marks: ");
		ch=sc.nextDouble();
		System.out.print("Enter the Professional Ethics marks: ");
		et=sc.nextDouble();
	      if(p<0 || c<0 || m<0 || ph<0 || ch<0 || et<0 || p>100 || c>100 || m>100 || ph>100|| ch>100 || et>100)
		{
			System.out.print("Invalid input");	
			return;
		}
		if(p<50 || c<50 || m<50 || ph<50 || ch<50 || et<50)
		{
			System.out.print("Grade: Fail");	
			return;
		}
		to=p+c+m+ph+ch+et;
		a=(to/600)*100;
		System.out.println("Total= "+to);
		System.out.println("Aggregate= "+a);
		if(a>=75)
		{
			System.out.println("Distincttion");
		}
		if(a>=60 && a<75)
		{
			System.out.println("First Division");
		}
		if(a>=50 && a<60)
		{
			System.out.println("Second Division");
		}
	}
}

interface PI1 extends GPI 
{
}

interface PI2 extends GPI 
{
}

class grade implements PI1, PI2
 {
	public static void main(String args[])
	{
		grade d = new grade();
		d.show();
	}
}

question 11
import java.util.*;
public class pat
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter the rows: ");
		n=sc.nextInt();
		System.out.println();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

question 12
import java.util.*;
public class random
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println((int)(Math.random()*100));
		}
	}
}
