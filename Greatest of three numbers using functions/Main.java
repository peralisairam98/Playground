import java.util.Scanner;
class Main
{
 public static void main (String[] args)
 {
  int n1,n2,n3,gst;
  Scanner in = new Scanner(System.in);
  n1 = in.nextInt();
  n2 = in.nextInt();
  n3 = in.nextInt();
  gst = greatest_numbers(n1,n2,n3);
  System.out.print(gst); 
 }
 public static int greatest_numbers(int n1,int n2,int n3)
 {
  if(n1>n2 && n1>n3)
  {
   return n1;
  }
  else if(n2>n1 && n2>n3)
  {
   return n2;
  }
  else
  {
   return n3;
  }
 }
}