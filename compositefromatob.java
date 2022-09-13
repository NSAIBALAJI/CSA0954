import java.util.*;
public class Main {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
 System.out.print("enter the starting number:");
 int start = input.nextInt()+1;
 if (start<0){
     System.out.println("INVALID INPUT");  
 }
 System.out.print("enter the ending number:");
 int end = input.nextInt();
 if (end<0){
     System.out.println("INVALID INPUT");
 }
 while(start<=end){
 int count = 0;
 int j = 2;
 while(j<start){
 if(start%j==0)
 count++;
 j++;
 }
 if(count>0)
 System.out.println(start);
 start++;
 }
 }
}
