import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  int i,strlen;
  Scanner in = new Scanner(System.in);
  String str = in.nextLine();
  StringBuilder sb = new StringBuilder(str);
  strlen = sb.length();
  int arr[] = new int[26];
  for(i=0;i<26;i++)
  {
   arr[i] = 0;
  }
  for(i=0;i<strlen;i++)
  {
   char ch = sb.charAt(i);
   if(ch>='a' && ch<='z')
   {
    int offset = ch - 'a';
    arr[offset]++;
   }
   else if(ch>='A' && ch<='Z')
   {
    int offset = ch - 'A';
    arr[offset]++; 
   } 
  }
  for(i=0;i<26;i++)
  {
   if(arr[i] == 0)
   { 
    char ch = (char) (i + 'a'); 
    System.out.print(ch + " ");
   }
  }
 }
}  