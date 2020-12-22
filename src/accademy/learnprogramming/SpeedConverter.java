package accademy.learnprogramming;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long mph = -1;
        if (kilometersPerHour >= 0) {
            mph = Math.round(kilometersPerHour/1.609);
        }
        return mph;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + mph + "mi/h");
        }
    }
}
