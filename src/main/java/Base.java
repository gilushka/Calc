import Calc.Calculator;
import Wordarray.Wordarray;
import com.sun.java.util.jar.pack.Instruction;

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

        switch (iOper){
            case 1:
                Calculator calculator = new Calculator();
                calculator.start();
            case 2:
                Wordarray wordarray = new Wordarray();
                wordarray.start();
            case 3:
                Backcounting backcounting = new Backcounting();
                backcounting.start();
            default:
                System.out.println("Была выбрана несуществующая операция");
        }
/*        if (iOper == 1){
            Calculator calculator = new Calculator();
            calculator.start();
        }
        else if (iOper == 2){
            Wordarray wordarray = new Wordarray();
            wordarray.start();
        }
        else
            System.out.println("Была выбрана несуществующая операция");*/
        scanner.close();

    }
}
