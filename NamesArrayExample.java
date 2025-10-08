public class NamesArrayExample {
    public static void main(String[] args) {
        // Step 1: Create and initialize the array with names
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        // Step 2: Approach 1 - Using traditional for loop
        System.out.println("Printing names using traditional for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Step 3: Approach 2 - Using enhanced for loop (for-each loop)
        System.out.println("\nPrinting names using enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
