package com.company;

public class calculateFeetAndInchesToCM {

    public static void main(String[] args) {
        calcFtandInchesToCentimeter(157);
        calcFtandInchesToCentimeter(160 ,214);
    }

      public static double calcFtandInchesToCentimeter(double feet, double inches) {

          if ((feet < 0) || ((inches < 0) && (inches > 12))) {
              return -1;
          }
        double centimeters = (feet *12) * 2.54;
          centimeters += inches * 2.54;
          System.out.println(feet + " feet" + inches + " Inches " + centimeters + " Centimeters");
          return  centimeters;
    }
    public static double calcFtandInchesToCentimeter( double inches) {

        if(inches < 0 ){
            return  -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches" + feet + " Feet " + remainingInches + " Remaining Inches");
        return  calcFtandInchesToCentimeter(feet,remainingInches);
    }

}
