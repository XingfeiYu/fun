package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xingfeiy on 3/16/16.
 */
public class DiceRollSimulator {
    private double[] percentages = new double[13];

    private int numberOfRolls = 0;

    public DiceRollSimulator(int numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }

    public double getPercentage(int value) {
        if(value < 2 || value > 12) {
            return 0;
        }
        return percentages[value];
    }

    public void play() {
        int[] counts = new int[percentages.length];
        int index = 0;
        while (index < numberOfRolls) {
            homework.DiceRollValue rollValue = homework.DiceRoll.roll2();
            if(!rollValue.isValid()) {
                continue;
            }

            counts[rollValue.getValue()] = counts[rollValue.getValue()] + 1;
            index++;
        }

        for(int i = 2; i < counts.length; i++) {
            percentages[i] = (double)counts[i] / numberOfRolls;
        }
    }

    public static void main(String[] args) {
        DiceRollSimulator_v1 simulator = new DiceRollSimulator_v1(1000);
        simulator.play();
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please inut the value:");
            try {
                String input = br.readLine();
                if(input.equalsIgnoreCase("done") || input.equalsIgnoreCase("quit")
                        || input.equalsIgnoreCase("q") || input.equalsIgnoreCase("exit")) {
                    break;
                }
                homework.DiceRollValue rollValue = homework.DiceRollValue.parse(input);
                if(!rollValue.isValid()) {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }

                System.out.println("The percentage of " + rollValue.getValue() + " is " + simulator.getPercentage(rollValue.getValue()));


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exiting program.");
    }

    public static class DiceRoll {
        public static homework.DiceRollValue roll2() {
            return new homework.DiceRollValue(randomWithRange(1, 6) + randomWithRange(1, 6));
        }

        private static int randomWithRange(int min, int max) {
            int range = (max - min) + 1;
            return (int)(Math.random() * range) + min;
        }
    }

    private static class DiceRollValue {
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
}

