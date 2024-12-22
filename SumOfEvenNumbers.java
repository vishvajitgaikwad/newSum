public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 0;

        // Loop until we have summed the first 100 even numbers
        while (count < 100) {
            // Check if the number is even
            if (number % 2 == 0) {
                sum += number; // Add the even number to the sum
                count++; // Increment the count of even numbers
            }
            number++; // Move to the next number
        }

        // Print the result
        System.out.println("The sum of the first 100 even numbers is: " + sum);
    }
}