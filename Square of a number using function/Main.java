import java.util.Scanner;
class Main
{
 public static int square(int n)
 {
  int square;
  square = n * n;
  return square; 
 }
 public static void main (String[] args)
 {
  int n,sq;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  sq = square(n);
  System.out.print(sq); 
 } 
}