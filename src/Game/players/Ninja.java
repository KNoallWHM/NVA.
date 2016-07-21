package Game.players;

import Game.util.Randint;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class Ninja extends Player {
    private int bladeMaxDamage = 10;
    private int bladeRangeProtection = 2;
    private int starMaxDamage = 3;
    private int starRangeProtection = 20;
    private int maxHitsPerRole = 4;
    private int accuracy = 12;
    private int forestProtection = 6;


    public int ninjaDamageGivenCalculator() {
        int damage = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = getRandomBladedamage() * getRandomHitsPerRole() * getRandomAccuracy();
        } else {
            damage = getRandomStarDamage() * getRandomHitsPerRole() * getRandomAccuracy();
        }

        return damage = getSpecialDamage(damage);

    }

    public int ninjaDamageReceivedCalculator(int rawDamageDealt) {
        int damage = 1;
        int protection = 0;
        if (getPlayerWeapon().equalsIgnoreCase("blade")) {
            damage = getRandomBladedamage() * (getRandomBladeProtection() * getRandomAccuracy());
        } else {
            damage = getRandomStarDamage() - (getRandomStarProtection() * getRandomAccuracy());
        }
        if (rawDamageDealt > protection + getForestProtection()) {
            damage = rawDamageDealt - (protection + getForestProtection());
        }
        this.removeHealth(damage);
        return damage;
    }


    private int getRandomBladedamage() {
        int damage = Randint.randomInt(1, bladeMaxDamage);
        return damage;

    }

    private int getRandomStarDamage() {
        int damage = Randint.randomInt(1, starMaxDamage);

        return damage;
    }

    private int getRandomHitsPerRole() {
        int hitsperrole = Randint.randomInt(1, maxHitsPerRole);
        return hitsperrole;
    }

    private int getRandomAccuracy() {
        int Accuracy = Randint.randomInt(1, accuracy);
        return accuracy;
    }

    private int getRandomBladeProtection() {
        int bladeprotection = Randint.randomInt(1, bladeRangeProtection);
        return bladeprotection;
    }

    private int getRandomStarProtection() {
        int starprotection = Randint.randomInt(1, starRangeProtection);
        return starprotection;
    }

    private int getForestProtection() {
        int protection = 0;

        if (getBattleLocation().equalsIgnoreCase("forest")) {
            protection = Randint.randomInt(0, forestProtection);
        }
        return protection;
    }


    // how to convert a double to an int
    // Double d = new Double(1.23);
    //  int i = d.intValue();


}

