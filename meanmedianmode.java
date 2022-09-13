import java.util.*;
    import java.lang.*;
    class Main
    {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int size = sc.nextInt();
      int[] myArray = new int[size];
      System.out.println("Enter the elements:");
      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
    double tot=0;
    double mean=0;
    for(int i=0; i<size; i++)
    {
    tot = tot+myArray[i];
    }
    mean = tot/size;
    System.out.println("The mean value is: "+mean);
    double median = 0;
    double mid=0;
    if(size%2 == 0)
    {
    int temp=(size/2)-1;
    for(int i=0;i<size;i++)
    {
    if(temp==i || (temp+1)==i)
    {
    mid=mid+myArray[i];
    }
    }
    mid=mid/2;
    System.out.println("Median value is: "+mid);
    }
    else
    {
    int temp=(size/2);
    for(int i=0;i<size;i++)
    {
    if(temp==i)
    {
    mid=myArray[i];
    System.out.println("Median value: "+mid);
    }
    }
    }
    int i,j,z, tmp, maxCount, modeValue;
    int[] tally=new int[size];
    for(i=0;i<size;i++)
    {
    for(j=0;j<size-i;j++)
    {
    if(j+1!=size)
    {
    if(myArray[j]>myArray[j+1])
    {
    tmp=myArray[j];
    myArray[j]=myArray[j+1];
    myArray[j+1]=tmp;
    }
    }
    }
    }
    for (i = 0; i < size; i++)
    {
    for(z=i+1;z<size;z++)
    {
    if(myArray[i]==myArray[z])
    {
    tally[i]++;
    }
    }
    }
    maxCount = 0;
    modeValue = 0;
    for (i = 0; i <size; i++)
    {
    if (tally[i] > maxCount)
    {
    maxCount = tally[i];
    modeValue = myArray[i];
    }
    }
    System.out.println("Mode value is :"+modeValue);
    }
    }
