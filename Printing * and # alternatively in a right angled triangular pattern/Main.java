import java.util.Scanner;
class Main { 
	public static void main(String[] args)
    { 
     int i,j,n; 
     Scanner in = new Scanner(System.in);
  	 n = in.nextInt();
     for(i=1;i<=n;i++)
     {
      for(j=1;j<=i;j++)
      {
       if((i==2) || (i==3) || (i==6))
        {  
         if(j%2==1)
         {
          System.out.print("#");
         } 
         else
         {
          System.out.print("*");
         }
        } 
       if((i==1) || (i==4) || (i==5))
        {
         if(j%2==1)
         {
          System.out.print("*");
         }
         else
         {
          System.out.print("#");
         } 
        } 
      }
      System.out.print("\n");  
     }   
    }
}
 