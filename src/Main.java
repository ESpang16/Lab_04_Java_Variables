//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 6;
        int intOperandB = 4;
        int intSum = 10;
        int intProduct = 24;
        int intDifference = 2;
        int intQuotient = 1;
        int intModulo = 43;
        double doubleOperandA = 12.7;
        double doubleOperandB = 8.9;
        double doubleSum = 20.6;
        double doubleProduct = 48.7;
        double doubleDifference = 4.4;
        double doubleQuotient = 2.8;
        double doubleModulo = 4;
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The quotient using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);
        int family = 5;
        System.out.println("The amount of kids in my family is: " + 6);
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("It is raining! Bring an umbrella!");
        } else {
            System.out.println("It is not raining!");
        }
        double gasPrice = 3.32;
        System.out.println("The price of gas is: " + "$" + gasPrice);
        int favNumber = 16;
        System.out.println("My favorite number is: " + favNumber);
        int shoeSize = 9;
        System.out.println("My shoe size is: " + "Mens " + shoeSize);
        String birthMonth = "My birth month is September!";
        System.out.println(birthMonth);
        String fullName = "My full name is Evan Spangler";
        System.out.println(fullName);
    }
}