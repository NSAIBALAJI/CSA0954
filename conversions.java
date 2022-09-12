public class Main
{
  public static void main(String[] args)
  {
   
    int num = 14, tmp;
    tmp = num;
    
    String binary = "";
    while(num >= 2)
    {
      binary = num%2 + binary ;
      num = num /2;
    }
    binary = num + binary ;
    System.out.println("Binary of " + tmp + " is " + binary);
    String octal = "";
    while(num >= 8)
    {
      octal = num%8 + octal;
      num = num /8;
    }
    octal = num + octal ;
    System.out.println("Octal of " + tmp + " is " + octal);
}
}
