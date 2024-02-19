import java.util.Scanner;

public class Ex2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter Number :");
		int c = sc.nextInt();
		
		if(a > b)
		if(a > c){
			System.out.println("The Greatest Number: " + a);
		} 

		if(b > a)
		if(b > c){
			System.out.println("The Greatest Number: " + b);
		} 

		if(c > a)
		if(c > b){
				System.out.println("The Greatest Number: " + c);
			}
		
	}
}