import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	 int n,sln;
     Scanner in=new Scanner(System.in);
     n=in.nextInt();
     sln=(((n%100000)%1000)%100)/10;
     System.out.println(sln); 
	}
}