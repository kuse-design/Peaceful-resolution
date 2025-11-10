import java.util.Scanner;
public class Username{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print(" Enter name : ");
String name = input.nextLine();

System.out.print(" set new pin not more then six digit : ");
 int passcode = input.nextInt();
input.nextLine();

System.out.println(" account created successfully ");

System.out.println(" ---------------------------------------------------------------------");

System.out.println(" login ");

System.out.print(" Enter name : ");
String username = input.nextLine();

System.out.print(" Enter pin : ");
 int code = input.nextInt();

if (name == username && passcode == code){
System.out.print(" login successful");
}

else{
System.out.print(" login unsuccessful");
}

}
}

