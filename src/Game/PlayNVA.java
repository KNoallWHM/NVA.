package Game;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class PlayNVA {
    private static NVA nva;

    public static void main(String[] args) {
        nva = new NVA();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets play a game.");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name);

        System.out.println("Are you a Ninja or Alien? [ninja/alien]");
        String playerType = scanner.nextLine();

        if (playerType.equalsIgnoreCase("ninja")) {
            System.out.println("Noble choice, the Ninja is stealthy and fast.");
        } else if (playerType.equalsIgnoreCase("alien")) {
            System.out.println("Powerful choice, the Alien is scary and strong.");
        } else {
            System.out.println("Invalid player type.");
        }
        while (!(playerType.equalsIgnoreCase("ninja") || playerType.equalsIgnoreCase("alien"))) {
            System.out.println("Are you a Ninja or Alien? [ninja/alien]");
            playerType = scanner.nextLine();

            if (playerType.equalsIgnoreCase("ninja")) {
                System.out.println("Noble choice, the Ninja is stealthy and fast.");
            } else if (playerType.equalsIgnoreCase("alien")) {
                System.out.println("Powerful choice, the Alien is scare and strong.");
            } else {
                System.out.println("Invalid player type.");
            }
        }
        if (playerType.equalsIgnoreCase("ninja")) {

            System.out.println("Okay ninja, choose your weapon [blade/star]");
        } else {
            System.out.println("Okay alien, choose your weapon [claw/laser]");
        }
        String weapon = scanner.nextLine();
        if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
            System.out.println("the ninja blade is close range, but deals more damage");
        } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
            System.out.println("The ninja star does less damage, but keeps you at a safer range");
        } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
            System.out.println("The alien claw is close range, but deals more damage");
        } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
            System.out.println("the alien laser does less damage, but keeps you at a safer range.");
        } else {
            System.out.println("Invalid weapon.");
            while (!((playerType.equalsIgnoreCase("ninja") && ((weapon.equalsIgnoreCase("blade")) || (weapon.equalsIgnoreCase("star"))))) ||
                ((playerType.equalsIgnoreCase("alien") && ((weapon.equalsIgnoreCase("claw")) || (weapon.equalsIgnoreCase("laser")))))) {
                if (playerType.equals("ninja")) {
                    System.out.println("Okay ninja, choose your weapon [blade/star]");
                } else {
                    System.out.println("Okay alien, choose your weapon [claw/laser");
                }
                weapon = scanner.nextLine();
                if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("blade")) {
                    System.out.println("The ninja blade is close range, but deals more damage.");
                } else if (playerType.equalsIgnoreCase("ninja") && weapon.equalsIgnoreCase("star")) {
                    System.out.println("the Ninja star does less damge, but keeps you at a safer range.");
                } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("claw")) {
                    System.out.println("the alien claw is close range, but deals more damage.");
                } else if (playerType.equalsIgnoreCase("alien") && weapon.equalsIgnoreCase("laser")) {
                    System.out.println("the alien laser does less damage, but keeps you at a safer range.");
                } else {
                    System.out.println("Invalid weapon.");
                }

            }

            System.out.println("Choose your location? [forest/space]");
            String location = scanner.nextLine();
            System.out.println("Choose your special attack? [speed/power/pain]");
            String special = scanner.nextLine();


        }


    }
}


