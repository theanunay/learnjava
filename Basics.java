import java.util.Scanner;

public class Basics{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		/* 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
		Expected Output :
		Hello
		AnuNay SiNgh

		System.out.println("Hello");
		System.out.println("AnuNay SiNgh");
		*/
		
		/* 2. Write a Java program to print the sum of two numbers.
		Test Data:
		74 + 36
		Expected Output :
		110
		
		int a = 74;
		int b = 36;
		
		System.out.print(a+b); */
				
		// Q3.
		
		// System.out.println(50/3);
		
		//Q4.
		
		// System.out.println(-5 + 8 * 6);
		// System.out.println((55+9) % 9);
		// System.out.println(20 + -3*5 /8);
		// System.out.println(5 + 15/3 * 2 - 8 % 3);
		
		// Q5. 		
		// System.out.print("Input First Number :");
		// int num1 = sc.nextInt();
		// 
		// System.out.print("Input Second Number :");
		// int num2 = sc.nextInt();
		// 
		// System.out.println(num1 + "x" + num2 + ":" + num1 * num2);
		
		// Q6. 
		/*
		System.out.print("Input First Number: " );
		int num1 = sc.nextInt();
		
		System.out.print("Input Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
		System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
		System.out.println(num1 + "*" + num2 + " = " + num1 * num2);
		System.out.println(num1 + "/" + num2 + " = " + num1 / num2);
		System.out.println(num1 + " mod " + num2 + " = " + num1 % num2);
		*/
		
		// Q7.
		/*
		System.out.print("Input a number: ");
		int num1 = sc.nextInt();
		
		for(int i = 0; i < 10; i++){
			System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
		}
		*/
		
		// Q8.
		/*
		System.out.println("   J    a   	v      v  a");
		System.out.println("   J   a a       v    v  a  a");
		System.out.println("J  J  aaaaa       v  v   aaaaa");
		System.out.println(" JJ   a   a        v     a   a");
		*/
		
		// Q9.
		/*
		double data = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
		
		System.out.println(data);
		*/
		
		// Q10.
		/*
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		*/
		
		// Q11.
		/*
		final double radius = 7.5;
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter : " + perimeter);
		System.out.println("Area : " + area);
		System.out.println("Value of PI :" + Math.PI);
		*/
		
		// Q12.
		/*
		System.out.print("Enter the Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the Number 3 : ");
		int num3 = sc.nextInt();
		
		System.out.println("Average of the given numbers is : " + ((num1 + num2 + num3)/3));
		*/
		
		// Method 2 with for loop 
		/*
		System.out.println("Enter the count of the numbers : ");
		int count = sc.nextInt();
		
		int sum = 1, number = 0;
		float average = 0;
		
		for(int i = 0; i < count; i++){
			number = sc.nextInt();
			sum = sum + number;
		}
		
		average = sum / count;
	
		
		while(number <= count){
			System.out.println("Enter the number " + "(" + sum + ")" + " : "	);
			number += sc.nextInt();
			sum += 1;
		}
		
		average = (sum / count);
		System.out.println("Average of the " + count + " numbers is : " + average);
		
		
		
		// Q13. 
		
		float width = 5.5f;
		float height = 8.5f;
		
		double area = width * height;
		double perimeter = (width + height) * 2;
		
		System.out.println("Area is " + width + " * " + height + " = " + area);
		System.out.println("Perimeter is 2 * (" + width + " + " + height + ") " + " = " + perimeter);
		
		
		
		// Q14.
		
		String p1 = " * * * * * * ==============================\n  * * * * *  ==============================";
		String p2 = " ==========================================";
		
		for (int i = 0; i < 4; i++){
			System.out.println(p1);
		}
		
		System.out.println(" * * * * * * ==============================");
		
		for (int i = 0; i < 6; i++){
			System.out.println(p2);
		}
		
		
		
		// Q15. Swappin between two variables
		
		int a, b, temp;
		
		System.out.print("Enter the value of a : ");
		a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		b = sc.nextInt();
		
		
		System.out.println("Value of a and b before Swapping");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value of a and b after Swapping");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		
		
		// Q16.
		
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |] ");
		System.out.println(" |  ^  | ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
		*/
		
		int n = 5;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n-i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}