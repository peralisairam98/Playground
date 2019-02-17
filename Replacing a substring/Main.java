import java.util.Scanner;
class Main
{
 public static void main(String[] args) 
 { 
  int i,strlen;
  Scanner in = new Scanner(System.in);
  String str1 = in.nextLine();
  String sub_string = in.nextLine();
  String str2 = in.nextLine();
  String str = str1.replace(sub_string,str2);
  System.out.print(str); 
 }
}