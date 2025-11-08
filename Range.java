import java.util. Scanner;
public class Range{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a number : ");
int range = input.nextInt();

if ( range >= 1 && range <= 100){

System.out.println( " in range" );
}

if ( range > 100){
System.out.println( "out of range" );

}

}
}

