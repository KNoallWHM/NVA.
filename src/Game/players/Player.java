package Game.players;

import Game.util.Randint;

/**
 * Created by katiebunnell on 7/11/16.
 */
public abstract class Player {

    private int health = 200;
    private String playerName;
    private String playerWeapon;
    private String battleLocation;
    private String specialGift;
    private boolean isPain = false;
    public int turn = 0;


    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {this.turn = turn++; }


    public int getHealth() {
        return health;
    }

    public void removeHealth(int hit) {
        health -= hit;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public String getBattleLocation() {
        return battleLocation;
    }

    public void setBattleLocation(String battleLocation) {
        this.battleLocation = battleLocation;
    }

    public String getspecialGift() {
        return specialGift;
    }

    public void setSpecialGift(String specialGift) {
        this.specialGift = specialGift;
    }

    public boolean getispain() {
        return isPain;
    }

    public void setIsPain(boolean isPain) {
        this.isPain = isPain;
    }

    public int getSpecialDamage(int Damage) {
        double extDamage = 1;
        int randNum = Randint.randomInt(0, 100);

        if (getspecialGift().equalsIgnoreCase("speed") && randNum < 75) {
            extDamage = 1.2;

        } else if (getspecialGift().equalsIgnoreCase("power") && randNum < 50) {
            extDamage = 1.5;
        } else if (getispain() || getspecialGift().equalsIgnoreCase("pain") && randNum < 10) {
            setIsPain(true);
            Damage -= 3;
            if (Damage < 1) {
                Damage = 1;
            }
        }

        extDamage = extDamage * Damage;
        Double d = new Double(extDamage);
        return d.intValue();


    }

}


