import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
	 int num1,num2,num3;
     Scanner in=new Scanner(System.in); 
     num1=in.nextInt();
     num2=in.nextInt();
     num3=in.nextInt();
     if(num1>num2)
     {
      if(num1>num3)
      {
       System.out.print(num1);
      } 
     } 
     else if(num2>num3)
     {
      System.out.print(num2);
     } 
     else
     {
      System.out.print(num3);
     } 
    }
}