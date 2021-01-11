package accademy.learnprogramming;

public class MethodOverload {

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double result = -1;
        if (feet < 0){
            return result;
        } else if(inches < 0 && inches > 12){
            return result;
        }

        result = (inches + calcFeetAndInchesToCentimeters(feet)) * 2.54;
        return result;

    }

        public static double calcFeetAndInchesToCentimeters(int feet) {
        double result;
        result = feet*12;
        return result;

    }


}
