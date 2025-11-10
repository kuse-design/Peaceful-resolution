import java.util.Scanner;
public class Gratuity {
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print( "Enter subtotal : ");
double subTotal = input.nextDouble();

System.out.print(" Enter gratuity");
double grat = input.nextDouble();

int total = grat % subtotal;



}
}
}
