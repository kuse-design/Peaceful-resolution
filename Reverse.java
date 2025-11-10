import java.util.Scanner;
public class Reverse{
public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.print( " Enter number : ");
int numb = input.nextInt();

int num = 1234;
int reverse= 0;
int digit = 0;

while(num >0){
digit = num % 10;
reverse = reverse *10 + digit;
num/=10;
}

System.out.println(reverse);
}
}

