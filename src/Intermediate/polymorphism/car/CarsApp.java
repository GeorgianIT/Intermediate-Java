package Intermediate.polymorphism.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short) 492, (short)592, (short)8700, 50000, 15000, false);
        redDodgeChallenger.startTheEngine();
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(-35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        System.out.println("The car is in city mode.");
        redDodgeChallenger.startTheElectricEngine();
        System.out.println("The car has "+redDodgeChallenger.getMileage()+ " miles");
        redDodgeChallenger.drive(140);
        System.out.println("After driving the car, it has "+redDodgeChallenger.getMileage()+ " miles");
        //redDodgeChallenger.getDescription();

        System.out.println("---------------------------------------------------------------");

        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392, (short)492, (short)6700, 30000, 10000, false);
        //orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short) 672, (short)892, (short)4000, 18000, 100000, false);
        //blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();

    }
}
