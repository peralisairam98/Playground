import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int n,n1;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  while(n>100)
  {
   n = n/10;
  } 
  n1 = n%10;
  System.out.print(n1); 
 } 
}