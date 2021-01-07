package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.toMilesPerHour(10.5);
        SpeedConverter.printConversion(10.5);
        MegaBytes.printMegaBytesAndKiloBytes(2500);
        MegaBytes.printMegaBytesAndKiloBytes(0);
        System.out.println(BarkingDog.shouldWakeUp(true, 1));

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored ");
        return score *1000;
    }
    public static int calculateScore (int score) {
        System.out.println("Unnamed player " + score+ " points ");
        return score * 1000;
    }
}
