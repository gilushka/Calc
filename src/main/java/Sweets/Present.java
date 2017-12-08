package Sweets;

import java.util.Scanner;

/**
 * Класс-компоновщик подарка
 */
public class Present {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Вы хотите добавить сладость к подарку?");
            String sWish = scanner.next();
            if (sWish.equals("да")){
                System.out.println("Какую сладость вы хотите добавить(конфета - 1, печенька - 2, кексик - 3)?");
                int iSweetType = scanner.nextInt();
                if (iSweetType == 1){
                    Candy candy = new Candy();
                    System.out.println("Введите название конфеты: ");
                    candy.setsName(scanner.next());
                    System.out.println("Сколько конфет вы хотите добавить (в граммах)?");
                    candy.setiWeight(scanner.nextInt());
                    System.out.println("Какая цена у этих конфет?");
                    candy.setfCost(scanner.nextFloat());
                    System.out.println("Кто произвел эти конфеты?");
                    candy.setsFactory(scanner.next());
                }
                else{
                    
                }
            }
        }
    }
}
