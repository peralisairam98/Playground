import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   int n,n1,last_digit,middle_digit,first_digit;
   Scanner in=new Scanner(System.in);
   n=in.nextInt();
   first_digit=n/100;
   middle_digit=(n/10)%10;
   last_digit=n%10;
   n1=(last_digit)*100+(middle_digit)*10+first_digit;
   System.out.println(n1);  
  }
}