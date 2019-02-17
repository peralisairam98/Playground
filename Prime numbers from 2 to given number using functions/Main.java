import java.util.Scanner;
class Main
{
 public static void main (String[] args)
 {
  int i=2,n;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  for(i=2;i<=n;i++)
  {
   if(is_prime(i))
   {
    System.out.println(i);
   }
  }
 }
 public static boolean is_prime(int n)
 {
  int j=2;
  boolean isprime = true;
  for(j=2;j<=n/2;j++)
  {
   if(n%j==0)
   {
    isprime = false;
    break; 
   }
  }
  return isprime; 
 }
}