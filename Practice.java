import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1. 

//        int principalAmount = 2000;
//        int rate = 6;
//        int duration = 3;
//
//        int finalAmount = (principalAmount * rate * duration) / 100;
//
//        System.out.println("Simple interest at the End of 3 years : " + finalAmount);
//        System.out.println("Total Payable Amount: " + (finalAmount + principalAmount));

        // Q2.
//        System.out.println("Enter a number here: ");
//        int number = sc.nextInt();
//
//        if (number < 0){
//            System.out.println("This a negative Number.");
//        } else if (number > 0) {
//            System.out.println("This is a positive Number.");
//        } else
//            System.out.println(number);

        // Q3.
        /*
        System.out.print("Enter a number here: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number here: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number here: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The Greatest Number is :" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The Greatest Number is :" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The Greatest Number is : " + num3);
        }else
            System.out.println("Any two numbers are of the same value. Try again");
        */

        // Q4.
        /*
        System.out.println("Enter the price of product 1 : ");
        int product1 = sc.nextInt();
        System.out.println("Enter the price of product2 : ");
        int product2 = sc.nextInt();
        System.out.println("Enter the price of product3 : ");
        int product3 = sc.nextInt();
        System.out.println("Enter the price of product4 : ");
        int product4 = sc.nextInt();

        float totalAmount = (product1 + product2 + product3 + product4);

        System.out.println("Final Amount for the bill : " + totalAmount);

        if (totalAmount >= 1000){
            System.out.println("Discounted Price (10%) : " + (totalAmount - (totalAmount*10/100)));
        }
        */

        // Q5.
        /*
        System.out.println("Enter the price of product 1 : ");
        int product1 = sc.nextInt();
        System.out.println("Enter the price of product2 : ");
        int product2 = sc.nextInt();
        System.out.println("Enter the price of product3 : ");
        int product3 = sc.nextInt();
        System.out.println("Enter the price of product4 : ");
        int product4 = sc.nextInt();

        float totalAmount = (product1 + product2 + product3 + product4);

        System.out.println("Final Amount for the bill : " + totalAmount);

        if (totalAmount >= 1000){
            System.out.println("Discounted Price (20%) : " + (totalAmount - (totalAmount*20/100)));
        } else
            System.out.println("Discounted Price (10%) : " + (totalAmount - (totalAmount*10/100)));
         */

        // Q6.

//        System.out.print("Enter a letter here : ");
//        char ch = 'b';
//
//        switch (ch){
//            case 'a':
//                System.out.println("Vowel");
//                break;
//            case 'e':
//                System.out.println("Vowel");
//                break;
//            case 'i':
//                System.out.println("Vowel");
//                break;
//            case 'o':
//                System.out.println("Vowel");
//                break;
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            case 'A':
//                System.out.println("Vowel");
//                break;
//            case 'E':
//                System.out.println("Vowel");
//                break;
//            case 'I':
//                System.out.println("Vowel");
//                break;
//            case 'O':
//                System.out.println("Vowel");
//                break;
//            case 'U':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }

        // Q7.

//        System.out.println("Enter the marks of Physics : ");
//        int physics = sc.nextInt();
//        System.out.println("Enter the marks of Chemistry : ");
//        int chemistry = sc.nextInt();
//        System.out.println("Enter the marks of Maths : ");
//        int maths = sc.nextInt();
//        System.out.println("Enter the marks of English : ");
//        int english = sc.nextInt();
//        System.out.println("Enter the marks of Hindi : ");
//        int hindi = sc.nextInt();
//
//        int totalMarks = physics + chemistry + maths + english + hindi;
//        float averageOfMarks = (physics + chemistry + maths + english + hindi)/5;
//
//        System.out.println("Total Marks of the Student is : " + totalMarks);
//        System.out.println("Average : " + averageOfMarks);
//
//        if (averageOfMarks > 80){
//            System.out.println("Grade : A");
//        } else if (averageOfMarks >= 60 ) {
//            System.out.println("Grade : B");
//        }else if (averageOfMarks >= 40){
//            System.out.println("Grade : C");
//        }else
//            System.out.println("Grade : D");

        // Q8.
        /*
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0 ){
            System.out.println(num + " is even.");
        } else
            System.out.println(num + " is odd.");
         */

        // Q9.
        /*
        System.out.print("Enter a character here : ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("It is a LETTER.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a DIGIT.");
        } else
            System.out.println("It is a SPECIAL CHARACTER.");

         */

        // Q10.
        /*
        System.out.println("Enter a Letter : ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("It is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is UPPERCASE.");
        } else
            System.out.println("It is not a letter.");

         */
        // Q11.
        /*
        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the service year: ");
        int serviceYear = sc.nextInt();

        float amountWithBonus = (float)(salary + (salary * 5/100));


        if (serviceYear > 5){
            System.out.println("Your Salary with 5% Bonus : " + amountWithBonus);
        } else
            System.out.println("Your Salary without Bonus : " + salary);

         */
        // Q12.
        /*
        System.out.println("Enter the no of Classes : ");
        int totalClasses = sc.nextInt();
        System.out.println("Enter the presence in the class : ");
        int presentInClass = sc.nextInt();

        float percentageOfClasses = (float)presentInClass / totalClasses * 100f;
        System.out.println(percentageOfClasses);

        if (percentageOfClasses > 75){
            System.out.println("You are eligible to sit in the examination");
        } else
            System.out.println("You are not eligible to sit in the examination.");

         */
        // Q13.
        /*
        System.out.println("Enter the Unit of Electricity Used : ");
        int unit = sc.nextInt();

        if (unit > 300){
            System.out.println("Rate per unit --> Rs. 3/- " + unit * 3);
        } else if (unit <= 300){
            System.out.println("Rate per unit --> Rs. 3/- " + unit * 2);
        } else if (unit <= 200){
            System.out.println("Rate per unit --> Rs. 2/- " + unit);
        } else
            System.out.println("Free use.");

         */
        //Q14. Find taxable amount
        /*
        System.out.println("Enter Your Salary : ");
        int salary = sc.nextInt();
        int tax25 = salary * 25/100;
        int tax20 = salary * 20/100;
        int tax10 = salary * 10/100;
        int tax0 = salary;
        if (salary > 30000){
            System.out.println("Taxable amount (25%) : " + tax25);
        }else if (salary <= 10000){
            System.out.println("Taxable amount (0%) : " + tax0);
        } else if (salary <= 20000) {
            System.out.println("Taxable amount (10%) : " + tax10);
        }else if (salary <= 30000) {
            System.out.println("Taxable amount (20%) : " + tax20);
        }

         */
        // Q15.
        /*
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number : ");
        int num3 = sc.nextInt();
        System.out.println("Enter a number : ");
        int num4 = sc.nextInt();
        System.out.println("Enter a number : ");
        int num5 = sc.nextInt();


        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("The Greatest Number is : " + num1);
        }
            if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
                System.out.println("The Greatest Number is : " + num2);
            }
                if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
                    System.out.println("The Greatest Number is : " + num3);
                }
                    if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
                        System.out.println("The Greatest Number is : " + num4);
                    }
                        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
                            System.out.println("The Greatest Number is : " + num5);
                        }

         */

            // Q16.
        /*
        System.out.println("Enter a number to print Week Day :");
        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not Available.");
        }

         */

        // Q17.
        /*
        System.out.println("Enter a number to print Month Name :");
        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("Month Name = January" + "\nDays in Month : 31." );
                break;
            case 2:
                System.out.println("Month Name = February" + "\nDays in Month : 28.");
                break;
            case 3:
                System.out.println("Month Name = March" + "\nDays in Month : 31.");
                break;
            case 4:
                System.out.println("Month Name = April" + "\nDays in Month : 30.");
                break;
            case 5:
                System.out.println("Month Name = May" + "\nDays in Month : 31.");
                break;
            case 6:
                System.out.println("Month Name = June" + "\nDays in Month : 30.");
                break;
            case 7:
                System.out.println("Month Name = July" + "\nDays in Month : 31.");
                break;
            case 8:
                System.out.println("Month Name = August" + "\nDays in Month : 31.");
                break;
            case 9:
                System.out.println("Month Name = September" + "\nDays in Month : 30.");
                break;
            case 10:
                System.out.println("Month Name = October" + "\nDays in Month : 31.");
                break;
            case 11:
                System.out.println("Month Name = November" + "\nDays in Month : 30.");
                break;
            case 12:
                System.out.println("Month Name = December" + "\nDays in Month : 31.");
                break;
            default:
                System.out.println("Not Available.");
        }

         */
        // Q18.
        /*
        This code is missing or is under review.

        }

         */
    // Q19.
        /*
        System.out.print("Enter first Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number : ");
        int num3 = sc.nextInt();
        System.out.print("Enter fourth Number : ");
        int num4 = sc.nextInt();


        if (num1 > num2 && num1 > num3 && num1 > num4){
            System.out.println("The greatest number is : " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("The greatest number is : " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("The Greatest number is : " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println("The greatest number is : " + num4);
        } else
            System.out.println("All the values are same. Try again");

         */
    // Q20. Whether it is Leap year or not.
        /*
        System.out.print("Enter a name of year : ");
        int year = sc.nextInt(); //1600

        if (year%100 == 0 && year%400 == 0 || year%100 != 0 && year % 4 == 0){
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
         */

    }
    }
