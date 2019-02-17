import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int f=n/100;
     int t=n%10;
     int sum=f+t;
     System.out.println(sum); 
	}
}