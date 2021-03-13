import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DotComTest {
@Test
    public void dotComTestDrive(){
    DotCom dotCom = new DotCom();
    int[] locations = {2,3,4};

    dotCom.setLocationCells(locations);

    String userGuess1 = "1";
    String result1 = dotCom.checkTheHit(userGuess1);
    if (result1.equals("Мимо")){
        System.out.println("test 1 is passed. User missed the shot");
    } else System.out.println("test 1 failed");

    String userGuess2 = "2";
    String result2 = dotCom.checkTheHit(userGuess2);
    if (result2.equals("Попал")){
        System.out.println("test 2 is passed. The hit was successful");
    } else System.out.println("test 2 failed");

    String userGuess3 = "3";
    String userGuess4 = "4";
    dotCom.checkTheHit(userGuess3);
    String result3 = dotCom.checkTheHit(userGuess4);
    if (result3.equals("Сайт потоплен")){
        System.out.println("test 3 passed. Site was deleted completely");
    } else System.out.println("test 3 failed");
}
}