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

        System.out.println("������! ����� ������� � ����: " +
                "� ���� ���������� ����� ����� �� 1 �� 10, � �� ���������");

        do{
            hiddenNumber = random.nextInt(10) + 1;

            System.out.print("����� ����� � �������? ");
            userNumber = scanner.nextInt();

            if(userNumber==hiddenNumber)
            {
                System.out.println("���������! � ������� ����� " + hiddenNumber);
            }
            else
            {
                System.out.println("���, �� ����� ���� � ��������� " + hiddenNumber);
            }

            System.out.print("������� ��� ���? (y/n) ");
            userChoice = scanner.next();


        } while (Objects.equals(userChoice, "y"));

        System.out.println("������� ��������, ������� ���)))");

    }
}