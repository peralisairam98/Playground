import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	 int n,count=1;
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     for(count=1;count<=n;count++)
     {
      if(count%2 == 1)
      {
       System.out.println(count);
      } 
     } 
	}
}