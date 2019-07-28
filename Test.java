import java.Util.Scanner;
import java.util.regex.Pattern;
public class Test{
  public static void main(String[] args){
	  java.util.Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Your Name ");
	  String name = sc.nextLine();
	  System.out.println("Hello "+name+" Welcome to Our Site!!!");
	  System.out.println("Ready of a simple Survey?")
	  System.out.println("1.Yes");
	  System.out.println("2.No");
	  //int ch=Integer.parseInt(sc.nextLine());
	  if(Integer.parseInt(sc.nextLine())==1)
		  System.out.println("Cool!! Glad to know it "+name);
	  else
		  System.exit(0);
	  System.out.println("So Which Colour Do you Like?")
	  String colour = Pattern.matches("^[a-zA-Z]{1,9}$", sc.nextLine());//sc.nextLine();
	  String str = new str;
  }
}
