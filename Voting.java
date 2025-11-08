
import java.util.Scanner;
public class Voting{
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

System.out.print("Enter your age : ");
int age = input.nextInt();


if (age  > 18 ){
System.out.println("you are eligible to vote");
}
if ( age  < 18 ){
System.out.println("you are not eligible to vote");

}
}

}
