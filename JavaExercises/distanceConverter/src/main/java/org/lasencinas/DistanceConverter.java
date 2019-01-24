package org.lasencinas;

public class DistanceConverter {

    public static double convertFeetToMeters(double feet){
        return feet * 0.3048;
    }

    public static double convertMetersToFeet(double meters){
        return meters * 3.2808;
    }

    public static double convertFeetToInches(double feet){
        return feet * 12;
    }

    public static double convertInchesToFeet(double inches){
        return inches / 12;
    }

    public static double convertCmToFeet(double cm){
        return convertMetersToFeet(cm / 100);
    }

    public static double convertFeetToCm(double feet){
        return convertFeetToMeters(feet) * 100;
    }

    public static double convertCmToInches(double cm){
        return convertFeetToInches(convertCmToFeet(cm));
    }

    public static double convertInchesToCm(double inches){
        return convertFeetToCm(convertInchesToFeet(inches));
    }
}
