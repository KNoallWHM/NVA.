package Game.util;

import java.util.Random;

/**
 * Created by Superduo on 7/14/16.
 */
public class Randint {


        public static int randomInt(int min, int max) {

            Random random = new Random(System.currentTimeMillis());
            int randomNumber = random.nextInt((max - min) +1) + min;
            //to call (random int) just call randomint

            return randomNumber;
        }


    }
