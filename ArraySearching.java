import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner inpuScanner = new Scanner(System.in);
        System.out.print("Enter Number you want to find: ");
        int num = inpuScanner.nextInt();

        int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        if (isfound(myArray, num)) {
            System.out.println("Your Number was found");
        } else {
            System.out.println("Number not found in array");
        }
    }

    public static boolean isfound(int array[], int num) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == num) {
                return true;
            }
        }
        return false;
    }
}
