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
         double res=0;

        System.out.println("Выберете операцию (сложение - 1, вычитание - 2, умножение - 3, деление - 4):");
        int oper = scanner.nextInt();

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

         switch(oper) {
             case 1:
                 res = num1 + num2;
                 break;
             case 2:
                 res = num1 - num2;
                 break;
             case 3:
                 res = num1 * num2;
                 break;
             case 4:
                 res = num1 / num2;
                 break;
         }

        System.out.printf("%+5.4f", res);
    }
}
