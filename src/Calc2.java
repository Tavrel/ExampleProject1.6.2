import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        int value1 = getInt();
        int value2 = getInt();
        char operation = getOperation();
        int result = calc(value1, value2, operation);
        System.out.println("Результат операции: " + result);
    }
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value;
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа, поробуйте ещё раз");
            scanner.next();
            value = getInt();
        }
        if (value == 0) {
            System.out.println("Вы допустили ошибку при вводе числа, поробуйте ещё раз");
            scanner.next();
            value = getInt();
        }

        return value;
    }
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции, поробуйте ещё раз");
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int value1, int value2, char operation) {
        int result;
        switch (operation) {

            case '-' :
                result = value1 - value2;
                System.out.println("Результат = "+ result);
                break;
            case '+' :
                result = value1 + value2;
                System.out.println("Результат = "+ result);
                break;
            case '/' :
                result = value1 / value2;
                System.out.println("Результат = "+ result);
                break;
            case '%' :
                result = value1 % value2;
                System.out.println("Результат = "+ result);
                break;
            default:
                System.out.println("Операция не распознана, введите заново");
                result = calc(value1, value2, getOperation());
        }
        return result;
    }
}
