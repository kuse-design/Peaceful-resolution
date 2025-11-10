import java.util.Scanner;
public class OddEven1{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print(" Enter an interger : ");
int numb = input.nextInt();
int remainder = numb % 2;

if ( remainder == 0){
System.out.print(" numb is an even number");
}else{
System.out.println( " numb is an odd number");
}
}
}
