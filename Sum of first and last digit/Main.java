import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	 int sum,n1,n;
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     n1 = n%10;
     while(n > 10)
     {
      n = n/10;
     } 
     sum = n+n1;
     System.out.print(sum); 
	}
}