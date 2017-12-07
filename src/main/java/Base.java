import Calc.Calculator;
import Wordarray.Wordarray;

import java.util.Scanner;

/**
 * @author Кочергин Евгений
 */

public class Base {

    /**
     * Основной модуль программы. С него вызывается всё остальное.
     */

    public static void main(String[] args) {
        System.out.println("Выберете что вы хотите делать дальше.");
        System.out.println("Если вы хотите поработать с калькулятором, нажмите 1, если с массивами - 2");
        Scanner scanner = new Scanner(System.in);
        int iOper = scanner.nextInt();
        if (iOper == 1){
            Calculator calculator = new Calculator();
            calculator.start();
        }
        else if (iOper == 2){
            Wordarray wordarray = new Wordarray();
            wordarray.start();
        }
            System.out.println("Была выбрана несуществующая операция");
        scanner.close();

    }
}
