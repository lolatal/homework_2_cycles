import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        if(monthNumber==1 || monthNumber ==2 || monthNumber==12){
            System.out.println("Зима");
        }
        else if (monthNumber==3 || monthNumber==4 || monthNumber==5){
            System.out.println("Весна");
        }
        else if (monthNumber==6 || monthNumber==7 || monthNumber==8){
            System.out.println("Лето");
        }
        else if (monthNumber==9 || monthNumber==10 || monthNumber==11){
            System.out.println("Осень");
        }
        else {
            System.out.println("Месяца с таким номером нету");
        }
    }
}
