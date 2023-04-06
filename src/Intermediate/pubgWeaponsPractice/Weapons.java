package Intermediate.pubgWeaponsPractice;

public class Weapons {
    private String name;
    private String ammoType;
    private int hitDamage;
    private double timeBetweenShots;
    private String firingModes;
    private int magazineSize;
    private double shootingTime;
    private double shoot;


    public Weapons(String name, String ammoType, int hitDamage, double timeBetweenShots, String firingModes, int magazineSize) {
        this.name = name;
        this.ammoType = ammoType;
        this.hitDamage = hitDamage;
        this.timeBetweenShots = timeBetweenShots;
        this.firingModes = firingModes;
        this.magazineSize = magazineSize;

    }

    public void weaponDescription(){
        System.out.println(name);
        System.out.println("Ammo Type: " + ammoType);
        System.out.println("Hit Damage: " + hitDamage);
        System.out.println("Time between shots: " + timeBetweenShots);
        System.out.println("Firing modes: " + firingModes);
        System.out.println("Magazine Size: " + magazineSize);
    }

    public void shoot(double shootingTime, int magazineSize, double timeBetweenShots){
        double maxShootingTime= magazineSize * timeBetweenShots;
        double shoot = shootingTime / timeBetweenShots;

        if(shoot > maxShootingTime){
            System.out.println("You have to reload! You shot all " + magazineSize +" in " + shoot);
        }else {
            System.out.println("You shot " + maxShootingTime );
        }
    }
}
