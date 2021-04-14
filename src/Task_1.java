import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        switch (monthNumber){
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяца с таким номером нету");
        }
    }
}
