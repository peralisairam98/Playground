import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int temp=0,i,n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int arr[] = new int[n];
  int ar[] = new int[n];
  for(i=0;i<n;i++)
  {
   arr[i] = in.nextInt();
   ar[i] = 0;  
  } 
  for(i=0;i<n;i++)
  {
   temp = arr[i];
   ar[temp-1]++; 
  }
  for(i=0;i<n;i++)
  {
   if(ar[i] == 0)
   {
    System.out.print(i+1);
   }
  }
 }
}