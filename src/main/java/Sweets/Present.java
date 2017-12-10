package Sweets;

import java.util.Scanner;

/**
 * Класс-компоновщик подарка
 */
public class Present {

    Sweets[] sweets = new Sweets[0];
    double totalWeight = 0;
    double totalCost = 0;
    
    public void addSweet(Sweets item){
        Sweets[] newSweets = new Sweets[sweets.length + 1];

        for (int i=0; i<sweets.length;i++){
            newSweets[i]=sweets[i];
        }
        newSweets[newSweets.length - 1] = item;
        sweets=newSweets;
        totalWeight += item.getiWeight();
        totalCost+=item.getfCost();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Вы хотите добавить сладость к подарку?");
            String sWish = scanner.next();
            if (sWish.equals("да")) {
                System.out.println("Какую сладость вы хотите добавить(конфета - 1, печенька - 2, кексик - 3)?");
                int iSweetType = scanner.nextInt();
                if (iSweetType == 1) {
                    Candy candy = new Candy();
                    System.out.println("Введите название конфеты: ");
                    candy.setsName("СуперКонфета");
//                    candy.setsName(scanner.next());
                    System.out.println("Сколько конфет вы хотите добавить (в граммах)?");
                    candy.setiWeight(200);
//                    candy.setiWeight(scanner.nextInt());
                    System.out.println("Какая цена у этих конфет?");
                    candy.setfCost(150);
//                    candy.setfCost(scanner.nextFloat());
                    System.out.println("Кто произвел эти конфеты?");
                    candy.setsFactory("Аплана Щедрая душа");
//                    candy.setsFactory(scanner.next());
                    addSweet(candy);

                }
            } else {
                System.out.println("Ваш текущий подарок: ");
                System.out.println("**************");
                for (int i = 0; i < sweets.length; i++) {
                    System.out.println("Позиция 1:" + sweets[i]);
                }
                System.out.println("Общий вес : "+totalWeight+"г");
                System.out.println("Общий стоимость : "+totalCost+"р");
                System.out.println("**************");
            }
        }

    }


}
