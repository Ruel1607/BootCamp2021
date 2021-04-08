package JavaArray.AutoBoxingAndUnboxing;


import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

public class Main {
    static class IntClass {
        private int myValue;

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }

        public IntClass(int myValue) {
            this.myValue = myValue;
        }
    }

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(54));


        Integer integer = new Integer(54);

        Double doubleValue = new Double(12.123);
        ArrayList<Integer> intArrayList2 = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            intArrayList2.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList2.get(i).intValue());
        }

        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDouble = new ArrayList<>();

        for(double dbl = 0.0 ; dbl <= 10.0; dbl += 0.5){
            myDouble.add(dbl);
        }

        for(int i =0 ; i< myDouble.size(); i++){
            double value = myDouble.get(i);
            System.out.println(i + " --> " + value);

        }
    }

}
