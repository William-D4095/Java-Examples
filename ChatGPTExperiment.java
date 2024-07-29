import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of inputs
        System.out.print("How many numbers would you like to input? ");
        int numOfInputs = scanner.nextInt();
        int[] numbers = new int[numOfInputs];

        // Collect the numbers
        for (int i = 0; i < numOfInputs; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the numbers
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        scanner.close();
    }
}
//coded using chatgpt