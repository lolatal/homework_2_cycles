import java.util.Scanner;

public class Task_3_Cycles {
    public static void main(String[] args) {
        System.out.println("Введите целое положительно число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for(int i=1; i<=number; i++){
            result += i;
        }
        System.out.println("Сумма= " + result);
    }
}
//3: 1+2+3 = 6
//5: 1+2+3+4+5 = 15
