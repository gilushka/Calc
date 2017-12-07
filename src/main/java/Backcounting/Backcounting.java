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
        System.out.println("Исходный массив:");
        for (int i = 0; i < 20; i++) {
            System.out.print(iArray[i] + " ");
        }
        System.out.println();
        int iMax = -10, iMin = 10, iMaxInd = -1, iMinInd = -1;
        for (int i = 0; i < 20; i++) {
            if ((iArray[i] > iMax) && (iArray[i] < 0)){
                iMax = iArray[i];
                iMaxInd = i;
            }
            if ((iArray[i] < iMin) && (iArray[i] > 0)){
                iMin = iArray[i];
                iMinInd = i;
            }
        }
        if ((iMaxInd >=0) && (iMinInd >= 0)){
            iArray[iMinInd] = iMax;
            iArray[iMaxInd] = iMin;
            System.out.println("Итоговый массив: ");
            for (int i = 0; i < 20; i++) {
                System.out.print(iArray[i] + " ");
            }
        }
        else
            System.out.println("Не соблюдены условия задачи");
//            System.out.println((i+1) + "-й элемент :" + iArray[i]);



    }

}
