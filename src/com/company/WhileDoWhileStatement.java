package com.company;

public class WhileDoWhileStatement {
    public static void main(String[] args) {

        int number = 0;
        int lNumber = 400;
        int evenNumberFound = 0;
        while (number <= lNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumberFound++;
            /*if (evenNumberFound == 10) {
                break;
            }*/

            System.out.println("EVEN NUMBER : " + number);
        }
        System.out.println("EVEN NUMBER FOUND : " + evenNumberFound);
    }


    /*   while (count !=11) {
           System.out.println("COUNT :" + count);
           count++;
*/
        /*    do {
                System.out.println("COUNT VALUE :" + count);
                count++;
            } while (count !=15 );
        }*/
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }


}

