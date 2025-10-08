class DoubleArrayWithLoop {
    public static void main(String[] args) {
        // store five floating-point (double) numbers
        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Approach 1 - print all numbers using a loop
        System.out.println("The numbers are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
		
		//  Approach 2 - Using enhanced for loop (for-each loop)
        System.out.println("\nThe numbers are:");
        for (double number : numbers) {
            System.out.println(number);
		}
    }
}
