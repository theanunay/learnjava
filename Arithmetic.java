import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the number b: ");
		int b = sc.nextInt();
		
		int Num1 = a + b;
		int Num2 = a - b;
		int Num3 = a * b;
		double Num4 = a*1.0 / b;
		int Num5 = a % b;
		
		System.out.println("Here is the Addition: " + Num1);
		System.out.println("Here is the Subtraction: " + Num2);
		System.out.println("Here is the Multiplication: " + Num3);
		System.out.println("Here is the Division / Cosent: " + Num4);
		System.out.println("Here is the Modulus / Remainder: " + Num5);
		
	}
}