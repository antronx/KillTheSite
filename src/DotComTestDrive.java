import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DotComTestDrive {
    public static void main(String[] args) {
        int numberOfGuesses = 0;
        DotCom dotCom = new DotCom();
        boolean siteState = true;
        int random = (int) (Math.random() * 5);
        ArrayList<String> siteArray = new ArrayList<>();
        siteArray.add(String.valueOf(random));
        siteArray.add(String.valueOf(++random));
        siteArray.add(String.valueOf(++random));
        dotCom.setLocationCells(siteArray);

        System.out.println("Введите число от 0 до 6");

        while (siteState) {
            Scanner scanner = new Scanner(System.in);
            String hit = scanner.nextLine();
            System.out.println(dotCom.checkTheHit(hit));
            numberOfGuesses++;
            siteState = dotCom.getIsAlive();
        }
        System.out.println("Вы потопили сайт с " + numberOfGuesses + " попытки. Игра окончена.");

    }
}
