import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
     int n,i,fact=1;
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     for(i=1;i<=n;i++)
     {
      fact = fact * i;
     } 
     System.out.print(fact); 
	}
}