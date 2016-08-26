package homework;

/**
 * Created by xingfeiy on 3/14/16.
 */
public class DiceRoll {
    public static DiceRollValue roll2() {
        return new DiceRollValue(randomWithRange(1, 6) + randomWithRange(1, 6));
    }

    private static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
