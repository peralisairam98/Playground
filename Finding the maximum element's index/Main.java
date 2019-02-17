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
  max_element(arr,n); 
 }
 public static void max_element(int arr[],int n)
 {
  int g,gst=0,i;
  g = arr[0]; 
  for(i=1;i<n;i++)
  {
   if(g > arr[i])
   {
    gst = g; 
   }
   else
   {
    gst = arr[i];
   }
   g = gst; 
  }
  for(i=0;i<n;i++)
  {
   if(gst == arr[i])
   {
    System.out.print(i);
   }
  }
 }
}  