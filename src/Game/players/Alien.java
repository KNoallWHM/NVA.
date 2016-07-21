package Game.players;

import Game.util.Randint;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class Alien extends Player {
    private int clawMaxDamage = 5;
    private int clawRangeProtection = 6;
    private int laserMaxDamage = 4;
    private int laserRangeProtection = 5;
    private int maxHitsPerRole = 4;
    private int accuracy = 3;
    private int spaceRoids = 2;

    public int alienDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = getRandomClawDamage() * getRandomHitsPerRole() * getRandomAccuracy();
        } else {
            damage = getRandomLaserDamage() * getRandomHitsPerRole() * getRandomAccuracy();
        }
        return (getSpecialDamage(damage));
    }

    public int alienDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 1;
        int protection = 0;
        if (getPlayerWeapon().equalsIgnoreCase("claw")) {
            damage = rawDamageDealt - (clawRangeProtection * accuracy);
        } else {
            damage = rawDamageDealt - (laserRangeProtection * accuracy);
        }
        if (rawDamageDealt > protection) {
            damage = rawDamageDealt - protection;
        }
        this.removeHealth(damage);
        return damage;
    }


    private int getRandomClawDamage() {
        int damage = Game.util.Randint.randomInt(1, clawMaxDamage);
        return damage;

    }

    private int getRandomLaserDamage() {
        int damage = Game.util.Randint.randomInt(1, laserMaxDamage);

        return damage;
    }

    private int getRandomHitsPerRole() {
        int hitsperrole = Game.util.Randint.randomInt(1, maxHitsPerRole);
        return hitsperrole;
    }

    private int getRandomAccuracy() {
        int Accuracy = Game.util.Randint.randomInt(1, accuracy);
        return accuracy;
    }

    private int getRandomBladeProtection() {
        int bladeprotection = Game.util.Randint.randomInt(1, clawRangeProtection);
        return bladeprotection;
    }

    private int getRandomStarProtection() {
        int starprotection = Game.util.Randint.randomInt(1, laserRangeProtection);
        return starprotection;
    }

    private int getSpaceRoids() {

        int damage = 0;

        if (getBattleLocation().equalsIgnoreCase("space")) {
            damage = Randint.randomInt(0, spaceRoids);
        }
        return damage;
    }

}
