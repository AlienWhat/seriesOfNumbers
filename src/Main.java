import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Введите число: ");
        number = scanner.nextInt();

        int i;
        i = 0;

        while (i < number) {
            System.out.println(number);
            i++;
        }

    }
}