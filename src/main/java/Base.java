import java.util.Scanner;

/**
 * @author Кочергин Евгений
 */

public class Base {

    /**
     * Выходных параметров нет, метод осуществляет вывод в
     * консоль результатов расчетов. При этом позволяет выбрать тип
     * проводимой операции.
     * В каком месте должны ставиться доки? На что тут ругается IDEA??
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double res = 0;

        System.out.println("Выберете операцию (+, -, *, /):");

        String sOper = scanner.next();
        char cOper = sOper.charAt(0);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        switch (cOper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Некорректная операция");
                break;
        }

        System.out.printf("%+5.4f", res);
        scanner.close();
    }
}
