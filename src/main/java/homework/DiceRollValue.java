package homework;

/**
 * Created by xingfeiy on 3/14/16.
 */
public class DiceRollValue {
    private int value = 0;

    public DiceRollValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isValid() {
        return (value >= 2 && value <= 12);
    }

    public static DiceRollValue parse(String str) {
        int intValue = 0;
        try {
            intValue = Integer.parseInt(str);
        } catch(NumberFormatException e) {
            return new DiceRollValue(0);
        } catch(NullPointerException e) {
            return new DiceRollValue(0);
        }
        return new DiceRollValue(intValue);
    }
}
