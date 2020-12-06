import java.util.Scanner;

public class Gps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operand1 = scanner.next();

        if (operand1.charAt(0) == '0') {
            operand1 = operand1.substring(1);
        }
       if (operand1.length() < 2 || operand1.length() > 5) {
            System.out.println(operand1);
            System.out.println("напиши от 2 до 5 символов");
        } else {
            System.out.println(operand1);
            System.out.println("молодец");
        }
    }
}
