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
        int iMax = 0, iMin = 0, iMaxInd = -1, iMinInd = -1;
        for (int i = 0; i < 20; i++) {
            if (iArray[i] > iMax){
                iMax = iArray[i];
                iMaxInd = i;
            }
            if (iArray[i] < iMin){
                iMin = iArray[i];
                iMinInd = i;
            }
//            System.out.println((i+1) + "-й элемент :" + iArray[i]);

        }

    }

}
