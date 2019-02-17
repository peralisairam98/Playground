import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int n,search1,search2,i,flag=0;
  Scanner in = new Scanner(System.in);
  n = in.nextInt();
  int arr[] = new int[n];
  for(i=0;i<n;i++)
  {
   arr[i] = in.nextInt();
  }
  search1 = in.nextInt();
  search2 = in.nextInt(); 
  for(i=0;i<n;i++)
  {
   if(arr[i] == search1)
   {
    System.out.println(i);
    flag++; 
   }
   else if(arr[i] == search2)
   {
    System.out.println(i);
    flag++;
   }   
  }
  if(flag == 1)
  {
   System.out.println("-1");
  }
 }
}