package Arrays.curd;

import java.util.Scanner;

public class Curd_operations {
    static int[] data = new int[10]; // fixed size array
    static int size = 0; // current size of array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter your choice: 1 -> Add, 2 -> Update, 3 -> Read, 4 -> Delete, 5 -> Exit");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    update(sc);
                    break;
                case 3:
                    read();
                    break;
                case 4:
                    delete(sc);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close(); // close the scanner
    }

    // Method to add an element
    public static void add(Scanner sc) {
        if (size < data.length) {
            System.out.print("Enter element to add: ");
            int value = sc.nextInt();
            data[size++] = value;
            System.out.println("Element added.");
        } else {
            System.out.println("Array is full. Cannot add more elements.");
        }
    }

    // Method to update an element at a given index
    public static void update(Scanner sc) {
        System.out.print("Enter index to update (0 to " + (size - 1) + "): ");
        int index = sc.nextInt();
        if (index >= 0 && index < size) {
            System.out.print("Enter new value: ");
            int newValue = sc.nextInt();
            data[index] = newValue;
            System.out.println("Element updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to read/display all elements
    public static void read() {
        System.out.println("Current array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Method to delete an element at a given index
    public static void delete(Scanner sc) {
        System.out.print("Enter index to delete (0 to " + (size - 1) + "): ");
        int index = sc.nextInt();
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
            System.out.println("Element deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
