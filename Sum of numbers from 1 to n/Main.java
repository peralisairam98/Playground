import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	 int n,count=1,sum=0;
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     for(count=1;count<=n;count++)
     {
      sum = sum+count;
     } 
     System.out.print(sum); 
	}
}