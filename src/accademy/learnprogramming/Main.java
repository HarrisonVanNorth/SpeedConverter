package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.toMilesPerHour(10.5);
        SpeedConverter.printConversion(10.5);
        MegaBytes.printMegaBytesAndKiloBytes(2500);
        MegaBytes.printMegaBytesAndKiloBytes(0);
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(CodingExercise.area(5.0));
        System.out.println(CodingExercise.area(-1));
        System.out.println(CodingExercise.area(5.0,4.0));


        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);

        System.out.println(MethodOverload.calcFeetAndInchesToCentimeters(6,0));
    }
    // method overloading
    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored ");
        return score *1000;
    }
    public static int calculateScore (int score) {
        System.out.println("Unnamed player " + score+ " points ");
        return score * 1000;
    }
    public static int calculateScore () {
        System.out.println(" No players name, no player score ");
        return 0;
    }
}
