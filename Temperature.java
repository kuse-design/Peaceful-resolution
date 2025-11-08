import java.util.Scanner;
public class Temperature{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the temperature: ");
int temp = input.nextInt();

if ( temp < 15){
System.out.println("Temperature is cold");
} 

if (temp >= 15 && temp <= 30 ){

System.out.println("Temperature is warrm");
}
if ( temp > 30){
System.out.println("Temperature is hot");
} 

}

}









