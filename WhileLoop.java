import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i = 1;
        Scanner sc = new Scanner(System.in);

    // Q1.
        /*
        int n;
        while(i <= n){
            System.out.print("1, 0, ");
            i++;
        }
         */
    // Q2.
        /*
        int x = 3;
        int n = 1;

        while(n <= 10){
            System.out.print(x*n + ", ");
            n++;
        }
         */
    // Q3.
        /*
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;

        while(n > 0){
            n = n/10;
            count++;
        }
        System.out.println("Length of the entered Value is : " + count);
        */
    // Q4.
        /*
        int n, sum = 0, i=0;
        System.out.print("How many natural numbers do you want to add together : ");
        n = sc.nextInt();

        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of " + n + " Natural Numbers is : " + sum);
         */
    // Q5.
        /*
        int i = 1, factorial = 1;
        System.out.println("Enter a number");
        long num = sc.nextInt();

//        while(i <= num){
//            factorial = factorial * i;
//            i++;
//        }
//        System.out.println("Factorial :" + factorial);

        while(num > 0){
            factorial *= num;
            num--;
        }
        System.out.println("Factorial : " + factorial);
         */

    // Q6.
        /*
        int result = 1, i =1;
        System.out.print("Base : ");
        int base = sc.nextInt();
        System.out.print("Power : ");
        int power = sc.nextInt();


        while(power != 0){
            result = result * base;
            power--;
        }
        System.out.println("Result is : " + result);
         */
    // Q7.
        /*
        int n = 100, i = 1, count = 0;

        while(i <= 10){
            System.out.println(i * i + 2 * (i - 1));
            i++;
        }
         */
    // Q8.
        /*
        int n, i = 1;
        n = 100;

        while(i <= n){
            System.out.println(i* 2 + 1);
            i = i * 2 + 1;
        }
         */
    // Q9.
        /*
        int n, i = 0;

        while (i <= 10) {
            System.out.println(i * i * i + 1);
            i++;
        }
         */
    // Q10.
        /*
        int n, i = 1, s = 0;
        while (i <= 10){
            s = s*10 + i;
            System.out.println(", " + s);
            i++;
        }
         */
    // Q11.
        /*
        int a = 6, b = 6;
        for (int i = 1; i <= 10; i++ ){
            System.out.println(a + " ");
            a = a + b;
            b = b + 3;
        }
         */
    // Q12. Printing Fibonacci Series upto n term. 0 1 1 2 3 5 8 13 ..... nth term.
        /*
        int term, a = 0, b = 1, c, i = 1;
        System.out.println("Enter the term : ");
        term = sc.nextInt();
        while (i <= 10){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
         */
    // Q13.
        /*
        int term, i = 1;
        double a = 1.0, sum = 0;
        System.out.println("Enter the term : ");
        term = sc.nextInt();
        while (i <= term){
            System.out.println("Value of term : " + "1.0/" + i + " is = " + a / i );
            sum = sum + a/i;
            i++;
        }
        System.out.println("Sum of the term is : " + sum);
         */

    //Q14.
        /*
        int i = 1, x, n, sum = 0;
        System.out.print("Enter the value of X : ");
        x = sc.nextInt();
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        while(i <= n){
            System.out.println(x + "*" + i + " = " + x * i);
            sum = sum + x * i;
            i++;
        }
        System.out.println("Sum of the term is : " + sum);
         */
    // Q15. Finding Prime number

        int n, a = 0, b = 3;
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();

        for (int j = 1; j <= 10; j++) {
            int sum = j;
            for (int i = 1; i <= n/10; i++) {
                System.out.print(sum + " ");
                sum = sum + 10;
            }
            System.out.println();
        }









    }
}
