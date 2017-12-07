package Wordarray;

import java.util.Scanner;

/**
 * Класс реализующий работу массива слов
 */
public class Wordarray {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов");
        int iWordCount = scanner.nextInt();

        String aWordArray[] = new String[iWordCount];
        for (int i = 0; i < iWordCount; i++) {
            System.out.println("Введите " + (i+1) + "-е слово массива:");
            aWordArray[i] = scanner.next();
        }

        String sLongWord = aWordArray[0];
        for (int i = 1; i < iWordCount; i++) {
            if (sLongWord.length() < aWordArray[i].length())
                sLongWord = aWordArray[i];
        }

        System.out.println("Самое длинное слово в введенном массиве: " + sLongWord);

    }

}
