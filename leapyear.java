import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter date ::");
      a= sc.nextInt();
      System.out.println("Enter month ::");
      b= sc.nextInt();
      System.out.println("Enter year ::");
      c= sc.nextInt();
      if(a>0 && a<=31 &&b>0 && b<=12 &&c>0)
      {
          if(c%4==0)
          {
              System.out.println("leap year");
          }
          else{
              System.out.println("not a leap year");
          }
      }
      else
      {
          System.out.println("enter valid details");
      }
      }
}
