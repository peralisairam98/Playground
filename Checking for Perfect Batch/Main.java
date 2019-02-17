import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int i,n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int arr[] = new int[n];
  for(i=0;i<n;i++)
  {
   arr[i] = in.nextInt();
  }
  check_batch(arr,n); 
 }
 public static void check_batch(int arr[],int n)
 {
  int i,batch_sum,curr_batch_sum,flag=0;
  batch_sum = arr[0] + arr[1] +arr[2];
  for(i=3;i<n;i=i+3)
  {
   curr_batch_sum = arr[i] + arr[i+1] +arr[i+2];
   if(curr_batch_sum == batch_sum)
   {
    flag = 1;
   }
  }
  if(flag == 1)
  {
   System.out.print("Perfect Batch");
  }
  else
  {
   System.out.print("Not a Perfect Batch");
  }
 }
}