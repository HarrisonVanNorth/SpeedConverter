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

    public static void printYearsAndDays (long minutes){
        long hours;
        long days;
        long years;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        hours = minutes/60;
        days = hours/24;
        years = days/365;

        if(years >= 1){
            days = days%365;
        }
        System.out.println("Years " + years + " Days " + days);


    }


}
