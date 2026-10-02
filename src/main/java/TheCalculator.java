/**
 * @author : Kabelo Tlhape
 * Project : MyCalculator
 * Date   : 2026/10/02
 **/
public class TheCalculator {
    /***
     * Calculates and return the sum of two numbers
     * @param x The first number
     * @param y The second number
     * @return The sum
     */
    public static double calcSum(double x, double y){
        return x + y;//1
    }
    /***
     * Calculates the difference of two numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The difference of two numbers
     */
    public static double subtract(double num1, double num2) {
        if (num1 < num2)//2
        {
            double temp = num2;//3
            num2 = num1;//4
            num1 = temp;//5
        }
        if (num1 == num2){//6
            System.out.println("Statement A");//7
        }else{
            System.out.println("Statement C");//8
        }
        if (num2 == 10){//9
            System.out.println("Statement B");//10
        }else{
            System.out.println("Statement D");//11
        }

        return num1 - num2;//12
    }

    /**
     * Multiple double.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return the double
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;//13
    }

    /**
     * Calculate and return the quotient of two numbers
     * @param num1 First number
     * @param num2 Second number
     * @return The quotient
     */
    public static double divide(double num1, double num2)  {
        if (num2 == 0) {//14
            throw new ArithmeticException("Cannot divide by zero");//15
        }
        return num1 / num2;//16
    }

}
