package JavaArray.Array;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("ENTER COUNT :");
        int count = scan.nextInt();
        scan.nextLine();

        int[] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);

        System.out.println("MIN = " + returnedMin);




    }

    private static int[] readIntegers(int count){

        int[]array = new int[count];

        System.out.println("ENTER : " + count + " INTEGERS VALUES \n"  );


        for(int i = 0 ; i<array.length; i++){
            System.out.print("ENTER NUMBER: ");
            int number = scan.nextInt();
            scan.nextLine();
            array[i] = number;

        }
        return  array;
    }


    private static int findMin(int [] array){
        int min = Integer.MAX_VALUE;

        for(int i =0 ; i<array.length; i++){
            int value = array[i];
            if (value < min){
                min = value;
            }
        }
        return  min;

    }
}
