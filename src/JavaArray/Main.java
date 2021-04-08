package JavaArray;

public class Main {

    public static void main(String[] args) {


        int [] array1 = {10,23,43,56,32};

        for(int i = 1 ; i <= array1.length; i++){
            for(int k =0  ; k<=array1.length; k++){
                System.out.println("VALUE " + k + " " +  array1[i]);

            }
        }

        int [] myVariable = new int[11];


        myVariable[5] = 50 ;
        myVariable[10] = 12220;
        for(int i = 1 ; i != myVariable.length; i++){
            myVariable[i] = i* 10;
            System.out.println(  i  + " : "+ myVariable[i]);
        }
        for(int i : myVariable ){
            System.out.println(i);
        }

        System.out.println("*******************CALLING THE METHOD PRINTAARAY******************************");
        printArray(myVariable);

    }
    public static void printArray(int[] array){
        for(int i = 1 ; i != array.length; i++){
            array[i] = i* 5;
            System.out.println(  i  + " : "+ array[i]);
        }
    }
}
