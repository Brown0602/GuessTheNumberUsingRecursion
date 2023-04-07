package first;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {

        int counts = 1;
        int number = new Random().nextInt(5);
        Recursion(number, counts);

    }

    private static void Recursion(int number, int counts) {

        System.out.println("Введите число от 0 до 5!");
        int results = new Scanner(System.in).nextInt();
        if (results == number) {
            System.out.println("Вы угадали число!");
        } else if (counts < 5 && results != number) {
            System.out.println("Вы не угадали!");
            Recursion(number, counts + 1);
        } else if (counts == 5) {
            System.out.println("Ваш лимит попыток окончен!");
        }
    }
}
