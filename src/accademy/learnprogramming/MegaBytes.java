package accademy.learnprogramming;

public class MegaBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes <= 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes /1024);
            System.out.println(kiloBytes % 1024);
        }



    }
}
