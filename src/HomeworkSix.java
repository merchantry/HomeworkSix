import java.util.Scanner;

public class HomeworkSix {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please inster the value of n:");
        int n = scan.nextInt();
        System.out.println("Please insert the value of k:");
        int k = scan.nextInt();

        //Notifies the user that the values aren't correct and waits for the next entry
        while ((n < k) || (k < 0)) {
            System.out.println("Please insert the values accordingly: n ≥ k ≥ 0");
            System.out.println("Please inster the value of n:");
            n = scan.nextInt();
            System.out.println("Please insert the value of k:");
            k = scan.nextInt();
        }
        System.out.println("The binomial coefficient of n = " + n + " and k = " + k + " is " + binomialCoefficient(n, k));

        //Prints the coefficient array for all values less than given k
        System.out.print("Coefficient array: ");
        int[] binomialCoefficientArray = new int[k + 1];
        for (int arrayIndex = 0; arrayIndex <= k; arrayIndex ++) {
            binomialCoefficientArray[arrayIndex] = binomialCoefficient(n, arrayIndex);
            System.out.print(binomialCoefficientArray[arrayIndex] + " ");
        }

    }

    //Returns the factorial of a given number
    public static int factorial (int givenNumber) {
        int factorial = 1;
        for (int factorialIndex = givenNumber; factorialIndex > 0; factorialIndex--) {
            factorial *= factorialIndex;
        }
        if (givenNumber == 0) {
            return 1;
        }
        else {
            return factorial;
        }
    }

    //Returns the binomial coefficient of two numbers
    public static int binomialCoefficient(int firstNumber, int secondNumber) {
        return factorial(firstNumber) / (factorial(secondNumber) * (factorial(firstNumber - secondNumber)));
    }
}
