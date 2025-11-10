import java.util.Scanner;
public class PoundsConvert{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print( " Enter pounds : ");
double pounds = input.nextDouble();

double kilo = pounds * 0.454;

System.out.print(  kilo );

}
}
