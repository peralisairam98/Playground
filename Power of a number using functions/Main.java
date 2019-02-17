import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int power,exponent,base;
  Scanner in = new Scanner(System.in);
  base = in.nextInt();
  exponent = in.nextInt(); 
  power = pow(base,exponent);
  System.out.print(power); 
 }
 public static int pow(int base,int exponent)
 {
  int powerr=base,i=1;
  for(i=1;i<exponent;i++)
  {
   powerr = powerr * base;
  }
  return powerr; 
 }
}