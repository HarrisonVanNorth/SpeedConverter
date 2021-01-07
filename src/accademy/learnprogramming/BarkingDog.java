package accademy.learnprogramming;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean state = false;

        if(hourOfDay < 8 || hourOfDay > 22 && barking == true ){
            state = true;
        }

        return state;

    }
}
