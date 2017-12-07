package Backcounting;

/**
 * Класс для расчетов в массиве целых случайных чисел
 */
public class Backcounting {
    public void start(){
        int iArray[] = new int[20];
        for (int i = 0; i < 20; i++) {
            iArray[i] = (int) (Math.random()*(20+1)) - 10;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println((i+1) + "-й элемент :" + iArray[i]);

        }

    }

}
