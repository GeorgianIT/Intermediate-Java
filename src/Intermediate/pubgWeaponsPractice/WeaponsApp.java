package Intermediate.pubgWeaponsPractice;

public class WeaponsApp {
    public static void main(String[] args) {
        Weapons m4a1 = new Weapons("M4A1","5.56mm", 40, 0.086,"Single & Auto", 30);

        m4a1.weaponDescription();
        m4a1.shoot(2.4,30, 0.086);
    }
}
