import java.util.Scanner;

public class Base {

     public static void main(String[] args) {

        /**
         * @author Кочергин Евгений
         * @return Выходных параметров нет, метод осуществляет вывод в
         * консоль результатов расчетов. При этом позволяет выбрать тип
         * проводимой операции.
         * В каком месте должны ставиться доки? На что тут ругается IDEA??
         */

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
