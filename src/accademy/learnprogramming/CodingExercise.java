package accademy.learnprogramming;

public class CodingExercise {

    public static double area (double radius){
        double value = -1.0;
        if (radius < 0){
            return value;
        }

        value = Math.PI * (radius *radius);
        return value;

    }

    public static double area (double x, double y){
        double value = -1.0;
        if (x < 0 || y < 0){
            return value;
        }

        value = x * y;
        return value;


    }
}
