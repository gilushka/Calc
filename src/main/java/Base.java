import Calc.Calculator;
import Wordarray.Wordarray;
import Backcounting.Backcounting;
//import com.sun.java.util.jar.pack.Instruction;

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
        System.out.println("Если вы хотите поработать с калькулятором, нажмите 1, если с массивами - 2, если хотите чтобы программа сама с собой поразвлекалась - 3.");
        System.out.println("А может вы хотите скомпоновать новогодний подарок? Тогда жмите 4 не стесняясь!");
        Scanner scanner = new Scanner(System.in);
        int iOper = scanner.nextInt();

        switch (iOper){
            case 1:
                Calculator calculator = new Calculator();
                calculator.start();
                break;
            case 2:
                Wordarray wordarray = new Wordarray();
                wordarray.start();
                break;
            case 3:
                Backcounting backcounting = new Backcounting();
                backcounting.start();
                break;
            default:
                System.out.println("Была выбрана несуществующая операция");
        }
        scanner.close();

    }
}
