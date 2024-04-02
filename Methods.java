import java.util.*;
public class Methods{
// Question 1 : Enter 3 numbers from the user and make a function to print their average.
/*
public static int calculateAverage(int a, int b, int c){
	int average = (a + b + c)/3;
	return average;
}
*/

// Q2 : Write a function to print the sum of all odd numbers from 1 to n.
public static int sumOfOddNumbers(int n){
	int sum = 0;
	for (int i=1; i<=n; i++){
		System.out.println(i);
	if (i%2 != 0)
	sum = sum + i;
	}
	return sum;
}

// Q3 : Write a function which takes in 2 numbers and returns the greater of those two.
public static int maximum(int a, int b){
	if(a>b)
		return a;
	else 
		return b;
}

// Q4 : Write a function that takes in the radius as inpout and returns the circumference of a circle.
public static double circumferenceOfCircle(double radius){
	double circumference = 2 * Math.PI * radius;
	return circumference;
}

// Q5 : Write a function that takes in age as input and returns if that person is eligible to vote or not. 
// A person of age > 18= is eligible to vote.
public static String isEligibleForVote(int age){
	if(age >= 18){
		return "Eligible for Vote.";
	} else
		return "Not Eligible for vote.";
}

// Q6 : Write an infinite loop using do while condition.
public static void runInfiniteLoop(){
	do {
		System.out.println("I am an infinite loop.");
	} while (true);
}

// Q7 : Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public static void countNumbers(int number, int positiveCount, int negativeCount, int zerosCount){
		positiveCount = 0;
        negativeCount = 0;
        zerosCount = 0;
	if(number > 0)
		positiveCount++;
	else if (number < 0)
		negativeCount++;
	else
		zerosCount++;
}
public static void displayCount(int positiveCount, int negativeCount, int zerosCount){
	System.out.println("Count of numbers : ");
	System.out.println("Count of positive numbers : " + positiveCount);
	System.out.println("Count of negative numbers : " + negativeCount);
	System.out.println("Count of zeros numbers : " + zerosCount);
}

public static int findPower(int x, int y){
	int power = (int)Math.pow(x,y);
	return power;
}

public static void printFibonacciSeries(int n){
	int a = 0;
	int b = 1;
	System.out.print(a + " " + b + " ");
	for(int i= 2; i<=n; i++){
		int c = a + b;
		System.out.print(c + " ");
		a = b;
		b = c;
	}
	
	
}



// Main method begins here -->
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	/* // Q1. Average-->
	
	System.out.print("Enter first number : ");
	int a = sc.nextInt();
	System.out.print("Enter second number : ");
	int b = sc.nextInt();
	System.out.print("Enter third number : ");
	int c = sc.nextInt();
	
	int average = calculateAverage(a, b, c);
	
	System.out.println("Average of 3 numbers is : " + average);
	*/
	
	// Q2. Sum of Odd numbers -->
	/*
	 System.out.print("Enter the number : ");
	 int n = sc.nextInt();
	 
	 int sum = sumOfOddNumbers(n);
	 
	 System.out.println("Sum of odd number to " + n + " is : " + sum);
	 */
	 
	 // Q3. Find maximum -->
	 /*
	System.out.print("Enter a : ");
	int a = sc.nextInt();
	System.out.print("Enter b : ");
	int b = sc.nextInt();
	
	int ans = maximum(a, b);
	 System.out.println(ans);
	 */
	 
	 // Q4. Circumference of a Circle -->
	 /*
	 System.out.print("Enter radius : ");
	 double radius = sc.nextDouble();
	 
	 double circumference = circumferenceOfCircle(radius);
	 
	 System.out.println("Circle of a circle with radius " + radius + " is : " + circumference);
	 */
	 
	 // Q5. Check whether a person is eligible for vote or not. -->
	 /*
	 System.out.print("Enter age : ");
	 int age = sc.nextInt();
	 
	 String eligible = isEligibleForVote(age);
	 System.out.println(eligible);
	 */
	 
	 // Q6. Write an infinite loop using do while condition. -->
	 
	// runInfiniteLoop();
	
	// Q7. Postive, Negative and Zeros -->
	/*
		int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
	
	do {
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number > 0)
		positiveCount++;
		else if (number < 0)
		negativeCount++;
		else
		zerosCount++;
		
		System.out.print("Do you want to enter another number? (y/n): ");
	} while(sc.next().equalsIgnoreCase("y"));
	
	System.out.println("Count of numbers : ");
	System.out.println("Count of positive numbers : " + positiveCount);
	System.out.println("Count of negative numbers : " + negativeCount);
	System.out.println("Count of zeros numbers : " + zerosCount);
	*/
	
	// Q8. find power.
	/*
	System.out.print("Enter the value of X : ");
	int x = sc.nextInt();
	System.out.print("Enter the value of Y : ");
	int y = sc.nextInt();
	
	int power = findPower(x, y);
	System.out.println(y + " Power of " + x + " returns : " + power);
	*/
	
	// Q9. Find Greatest Common Divisor of 2 numbers.
	// Q10. Print Fibonacci Series (a number is the sum of the previous 2 numbers that came before it)
	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	
	printFibonacciSeries(n);

	
}
}