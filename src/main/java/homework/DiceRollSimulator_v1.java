package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xingfeiy on 3/14/16.
 */
public class DiceRollSimulator_v1 {
    private double[] percentages = new double[13];

    private int numberOfRolls = 0;

    public DiceRollSimulator_v1(int numberOfRolls) {
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
            DiceRollValue rollValue = DiceRoll.roll2();
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
                DiceRollValue rollValue = DiceRollValue.parse(input);
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
}
