import java.util.Scanner;
class common {
 public static void main(String[] args) {
     try{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size first array:");
      
      int m = sc.nextInt();
      if(m<0){
          System.out.println("invalid input");
      }
      
      int[] a1 = new int[m];
      System.out.println("Enter the elements for the first array:");
      
         for(int i=0; i<a1.length; i++) {
         a1[i] = sc.nextInt();
      }
      System.out.println("Enter the size of second array:");
      int s2 = sc.nextInt();
      if(s2<0){
          System.out.println("invalid input");
      }
      int[] a2 = new int[s2];
      System.out.println("Enter the elements for second array:");
      for(int i=0; i<a2.length; i++) {
         a2[i] = sc.nextInt();
      }
      System.out.println("The commom element between two arrays is:");
  for(int i = 0; i < a1.length; i++){
   for(int j = 0; j < a2.length; j++){
    if(a1[i] == a2[j] &&  a1[i]>0){
     
     System.out.print(a1[i]+"  ");
    } 
   }
  }
  
     
      } 
      catch(Exception e) {
          System.out.println("invalid input");
      }
    }
   }
