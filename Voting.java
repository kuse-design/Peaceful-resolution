
import java.util.Scanner;
public class Voting{
public static void main(String[]args){

int age = 0;
        Scanner input = new Scanner(System.in);

System.out.println("Enter your age : ");
 age = input.nextInt();


if (age  > 18 ){
System.out.println("you are eligible to vote");
}
if ( age  < 18 ){
System.out.print("you no fit vote");

}
}

}
