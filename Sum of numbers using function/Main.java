import java.util.Scanner;
class Main
{
 public static int sum_of_num(int n)
 {
  int i=1,sum=0;
  for(i=1;i<=n;i++)
  {
   sum = sum + i;
  } 
  return sum; 
 } 
 public static void main (String[] args)
 {
  int n,sum_num;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  sum_num = sum_of_num(n);
  System.out.print(sum_num); 
 }
}