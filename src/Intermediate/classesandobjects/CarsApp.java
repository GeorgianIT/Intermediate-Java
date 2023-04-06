package Intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short) 492, (short)592, (short)8700, 50000, 15000, false);
        redDodgeChallenger.startTheEngine();
        //redDodgeChallenger.getDescription();

        System.out.println("---------------------------------------------------------------");

        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392, (short)492, (short)6700, 30000, 10000, false);
        //orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();
    }
}
