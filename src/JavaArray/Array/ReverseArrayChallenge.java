package JavaArray.Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayChallenge {
    public static void main(String[] args) {

        Integer [] arr ={3,2,1,4,5};
        int [] arr1 ={3,2,1,4,5};

        reverseArray(arr);

        System.out.println("ARRAY = " + Arrays.toString(arr1));
        reverseForLoopApproach(arr1);
        System.out.println("REVERSED ARRAY = " + Arrays.toString(arr1));

    }



    private static void reverseArray (Integer[] arr){

        System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));

    }

    private static void reverseForLoopApproach(int[] array){
        int maxIndex = array.length -1 ;
        int halfLength = array.length /2 ;

        for(int i = 0 ; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;


        }
    }
}
