package day05;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(90, 5);

    @Test
    void startLotteryTest() {

        List<Integer> result = lottery.startLottery();

        assertEquals(5, result.size());

        // számok különbözőségének a tesztelése
        for (int i = 0; i < result.size(); i++) {
            assertFalse(result.subList(i + 1, result.size()).contains(result.get(i)));
        }
    }
}