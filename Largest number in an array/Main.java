import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int gst=0,g,i,n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int arr[] = new int[n];
  for(i=0;i<n;i++)
  {
   arr[i] = in.nextInt();
  }
  g = arr[0]; 
  for(i=1;i<n;i++)
  {
   if(arr[i] > g)
   {
    gst = arr[i];
   }
   else
   {
    gst = g;
   }
   g = gst; 
  }
  System.out.print(gst); 
 }
}