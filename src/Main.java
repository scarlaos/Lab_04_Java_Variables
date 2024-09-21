//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 8;
        int intOperandB = 2;
        int intSum = 10;
        int intProduct = 16;
        int intDifference = 6;
        int intQuotient = 4;
        int intModulo = 0;

        double doubleOperandA = 3.50;
        double doubleOperandB = 12.50;
        double doubleSum = 16.00;
        double doubleProduct = 43.75;
        double doubleDifference = 9.00;
        double doubleQuotient = 3.57;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum of using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product of using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference of using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        System.out.println("The sum of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotients of using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        int kidsInFamily = 2;
        boolean isRaining = false;
        double gasPrice = 3.50;
        int myFavoriteNumber = 20;
        double myShoeSize = 10.00;
        int birthMonth= 12;
        String myName = "Olivia Scarlatella ";

    }
}