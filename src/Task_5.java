import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("У вас 10 попыток");
        for (int i = 0; i<10; i++) {
            System.out.println("Введите номер цвета радуги");
            Scanner scanner = new Scanner(System.in);
            int rainbowCol = scanner.nextInt();
            switch (rainbowCol) {
                case 1:
                    System.out.println("Красный");
                    break;
                case 2:
                    System.out.println("Оранжевый");
                    break;
                case 3:
                    System.out.println("Желтый");
                    break;
                case 4:
                    System.out.println("Зеленый");
                    break;
                case 5:
                    System.out.println("Голубой");
                    break;
                case 6:
                    System.out.println("Синий");
                    break;
                case 7:
                    System.out.println("Фиолетовый");
                    break;
                default:
                    System.out.println("Такого цвета радуги нет");
            }
        }
    }
}
