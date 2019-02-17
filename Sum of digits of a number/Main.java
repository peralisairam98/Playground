import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	 int n,n1,sum=0;
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     while(n>0)
     {
      n1 = n%10;
      sum = sum + n1;
      n = n/10; 
     } 
     System.out.print(sum); 
	}
}