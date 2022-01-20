package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int allNumbers;
    private int howManyNumbersSelected;
    private Random rnd = new Random();


    public Lottery(int allNumbers, int howManyNumbersSelected) {
        this.allNumbers = allNumbers;
        this.howManyNumbersSelected = howManyNumbersSelected;
    }

    public int getAllNumbers() {
        return allNumbers;
    }

    public int getHowManyNumbersSelected() {
        return howManyNumbersSelected;
    }

    public List<Integer> startLottery() {

        List<Integer> result = new ArrayList<>();

        while (result.size() != howManyNumbersSelected) {
            int actualNumber = rnd.nextInt(1, allNumbers);
            if (!result.contains(actualNumber)) {
                result.add(actualNumber);
            }
        }
        return result;
    }
}
