import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DotComTest {
    @Test
    public void dotComTestDrive() {
        DotCom dotCom = new DotCom();
        ArrayList<String> locations = new ArrayList<>();
        locations.add("2");
        locations.add("3");
        locations.add("4");

        dotCom.setLocationCells(locations);

        String userGuess1 = "1";
        String result1 = dotCom.checkTheHit(userGuess1);
        Assertions.assertTrue(result1.equals("Мимо"));

        String userGuess2 = "2";
        String result2 = dotCom.checkTheHit(userGuess2);
        Assertions.assertTrue(result2.equals("Попал"));


        String userGuess3 = "3";
        String userGuess4 = "4";
        dotCom.checkTheHit(userGuess3);
        String result3 = dotCom.checkTheHit(userGuess4);
        Assertions.assertTrue(result3.equals("Корабль потоплен"));
    }
}