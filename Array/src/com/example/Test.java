package com.example;

public class Test {

    public static void main(String[] args) {
        
        // Step 1: Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Access array elements using index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Step 3: Print all elements using a for loop
        System.out.println("\nAll elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Step 4: Calculate the sum of all array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num; // same as sum = sum + num;
        }
        System.out.println("\nSum of array elements: " + sum);

        // Step 5: Modify an element
        numbers[2] = 99;
        System.out.println("\nAfter modification:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
