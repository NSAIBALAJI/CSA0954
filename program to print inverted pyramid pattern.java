import java.util.*;
public class invert {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows:");
    int r=sc.nextInt();

    for(int i = r; i >= 1; --i) {
      for(int space = 1; space <= r - i; ++space) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
