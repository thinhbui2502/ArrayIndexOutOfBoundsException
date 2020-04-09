import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("The list of elements in the array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the index you want to find: ");
            int index = scanner.nextInt();
            System.out.println("The element with a index of " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
