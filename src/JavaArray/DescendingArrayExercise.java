package JavaArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingArrayExercise {
    private static Scanner scan  = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray  = getIntegers(5);
        for(int i = 0 ; i<myArray.length; i++){
            System.out.println("ELEMENTS " + i + ", TYPED VALUE WAS " + myArray[i]);
        }
        Arrays.sort(myArray);

        int desc = myArray.length-1;

        // reversing the order with a simple for-loop
        System.out.println("Array in descending order:");
        for(int i=desc; i>=0; i--) {
            System.out.println("ELEMENT : " + myArray[i]);
        }


        System.out.println("PRINT ARRAY ");
        printArray(myArray);
        System.out.println("SORTED ARRAY");
        printSort(myArray);



    }


    public static int[] getIntegers(int number){


        System.out.println("ENTER : " + number + " INTEGERS VALUES \n"  );
        int sum = 0;
        int[]values = new int[number];

        for(int i = 0 ; i<values.length; i++){
            System.out.print("ENTER NUMBER :" + i + " : ");
            values[i] = scan.nextInt();

        }
        return  values;
    }


    public static void printSort(int[] array){

        int[] arrDesc = Arrays.stream(array).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("SORTED ARRAY IS "+ Arrays.toString(arrDesc));
    }
    public static void printArray(int[] array){
        for(int i=0 ; i< array.length; i++) {

            System.out.println("PRINT ARRAY : " + array[i]);
        }
    }
}
