import java.util.Scanner;
public class Main
{
 public static void main (String[] args)
 {
  int GCD,n1,n2,n3;
  Scanner in = new Scanner(System.in);
  n1 = in.nextInt();
  n2 = in.nextInt();
  n3 = in.nextInt();
  GCD = gcd(n1,n2,n3);
  System.out.print(GCD); 
 }
 public static int gcd(int n1,int n2,int n3)
 {
  int min,g=0;
  if(n1>n2 && n1>n3)
  {
   min = n1;
  }
  else if(n2>n1 && n2>n3)
  {
   min = n2;
  }
  else
  {
   min = n3;
  }
  while(min>=1)
  {
   if((n1%min==0) && (n2%min==0) && (n3%min==0))
   {
    g = min;
    break; 
   }
   min--; 
  }
  return g; 
 }
}