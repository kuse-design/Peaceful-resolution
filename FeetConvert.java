import java.util.Scanner;
public class FeetConvert{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number of feet : ");
double numbFeet  = input.nextDouble();

double meter = numbFeet*0.305;

System.out.print(" Number of feet is : " + meter );


}
} 
