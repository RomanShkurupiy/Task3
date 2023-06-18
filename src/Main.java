import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Enter array length:  ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int [] array1 = new int [arrayLength];

        for (int i=0; i<array1.length; i++) {
            array1[i]=i;
        }
        System.out.println("[] array1");

        for (int i=0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //       System.out.println(Arrays.toString(array1));

// Multiplication  Multiplication  Multiplication  Multiplication  Multiplication  Multiplication
        System.out.println("Multiplication table");
        for (int i=10; i>0; i--){
            for (int j=10; j>0; j--){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        while (a>=0){
            System.out.print(a+ " ");
            a=a-1;
        }
        System.out.println();

//     Two-dimensional array
        System.out.println("Two-dimensional array");
        System.out.println("Enter two-dimensional array length");
        int [][] array2 = new int [scanner.nextInt()] [scanner.nextInt()];
        System.out.println("Enter data to the array (integer)");
        for (int i=0; i< array2.length; i++) {
            for (int j=0; j<array2[i].length; j++) {
                array2[i][j]=scanner.nextInt();
            }
        }
        for (int i=0; i<array2.length; i++) {
            for (int j=0; j< array2[i].length; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

        // The minimal value in the array
        System.out.println("The minimal value in the array");
        int [] array3 = new int[] {2, 9, 6, 2, 8, 10, 5, 6};
               int minValue = 10000;
        for (int i=0; i<array3.length; i++) {
            if (array3[i]<minValue) {
                minValue = array3[i];
            }
        }
        System.out.println("The minimal value of array " + Arrays.toString(array3)+ " is value " + minValue);


        // Sorting by the selection
        System.out.println("Sorting by the selection");
        int [] array4 = new int[] {2, 9, 6, 2, 8, 10, 5, 6};
        System.out.println("Array before sorting: " + Arrays.toString(array4));
        for (int i=0; i<array4.length; i++) {
            int position = i;
            int min = array4[i];
            for (int j=i+1; j<array4.length; j++) {
                if (array4[j]<min) {
                    position =j;
                    min = array4[j];
                }
            }
            array4[position]=array4[i];
            array4[i]=min;
        }
        System.out.println("Array after sorting: " +Arrays.toString(array4));
    }
}