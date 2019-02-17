import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int n,i=1;
   Scanner in = new Scanner(System.in);
   n = in.nextInt();
   for(i=1;i<=n;i++)
   {
    System.out.print(i);
    if((i%3==0) && (i!=n))
    {
     System.out.print(",");
    } 
   } 
  }
}