package JavaArray;

import java.util.Scanner;

public class AnotherArraySample {

    private static Scanner scan  = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntergers = getIntegers(6);
         for(int i = 0 ; i<myIntergers.length; i++){
            System.out.println("ELEMENTS " + i + ", TYPED VALUE WAS " + myIntergers[i]);
        }

        System.out.println("MY AVERAGE "+ getAverage(myIntergers));

    }


    public static int[] getIntegers(int number){


        System.out.println("ENTER : " + number + " INTEGERS VALUES \n"  );
        int sum = 0;
        int[]values = new int[number];

        for(int i = 0 ; i<values.length; i++){
            System.out.print("ENTER NUMBER :" + i + " : ");
            values[i] = scan.nextInt();

            sum += values[i] ;


        }
        System.out.println("TOTAL " + sum);


        return  values;
    }

    public static  double getAverage(int[] array){
        int sum = 0 ;
       for(int i=0 ; i< array.length; i++){
           sum+= array[i];
       }
        return (double)sum / (double)array.length ;
    }




}
