import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберете операцию (символы +, -, * или /):");
        String oper = scanner.next();

        System.out.println("Введите первое число:");
        double num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextInt();

        System.out.printf("");
    }
}
