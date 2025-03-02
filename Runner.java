//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        //get user input for two numbers


        boolean isTrue = true;
        double n1 = 0;
        while (isTrue) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter the first number: ");

                n1 = scan.nextDouble();
                isTrue = false;
            }
            catch (Exception e){
                System.out.println("Enter a valid number.");
                isTrue = true;
            }

        }

        boolean isTrue2 = true;
        double n2 = 0;
        while (isTrue2) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter the second number: ");

                n2 = scan.nextDouble();
                isTrue2 = false;
            }
            catch (Exception e){
                System.out.println("Enter a valid number.");
                isTrue2 = true;
            }

        }

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
