import java.util.*;
class Main {
	public static void main (String[] args) 
    {
	 int n,f,s,sum;
     Scanner in=new Scanner(System.in);
     n=in.nextInt();
     f=n/10;
     s=n%10;
     sum=f+s;
     System.out.println(sum); 
	}
}