import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hiddenNumber;
        int userNumber;
        String userChoice;

        System.out.println("Привет! Давай сыграем в игру: " +
                "я буду загадывать целые числа от 1 до 10, а ты отгадаешь");

        do{
            hiddenNumber = random.nextInt(10) + 1;

            System.out.print("Какое число я загадал? ");
            userNumber = scanner.nextInt();

            if(userNumber==hiddenNumber)
            {
                System.out.println("Правильно! Я загадал число " + hiddenNumber);
            }
            else
            {
                System.out.println("Неа, на самом деле я загадывал " + hiddenNumber);
            }

            System.out.print("Сыграем ещё раз? (y/n) ");
            userChoice = scanner.next();


        } while (Objects.equals(userChoice, "y"));

        System.out.println("Здорово поиграли, приходи ещё)))");

    }
}