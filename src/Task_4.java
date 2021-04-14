import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите температуру воздуха:");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp>-5){
            System.out.println("Тепло");
        }else if (temp<=-5 && temp>-20){
            System.out.println("Нормально");
        }else if (temp <= -20) {
            System.out.println("Холодно");
        } else{
            System.out.println("Информации о погоде нет");
        }
    }
}
