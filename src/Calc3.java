import java.util.Scanner;

public class Calc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши число");
//        while (!scanner.next().equals("c")){
            String operand1 = scanner.next();
            //теперь проверим, что пользователь ввёл число, а не что-то другое
            while (!operand1.matches(".*\\d.*")) {
                System.out.println("Это не число. Напиши только цифры, будь зайкой:)");
                operand1 = scanner.next();
            }
            //Если пользователь ввёл число, продолжаем запрашивать данные. Спрашиваем тип математического действия
            System.out.println("Круто,ты написал " + operand1 + "! Теперь напиши что-то одно из списка, что будем делать:\nсложение\nвычитание\nумножение\nделение");
            char operand2 = scanner.next().charAt(0);
            //Проверяем, ввёл ли он верное значение - что-то из списка. Если нет - запросим снова
            boolean a = operand2 == 'с';
            boolean b = operand2 == 'в';
            boolean c = operand2 == 'у';
            boolean d = operand2 == 'д';
            boolean x = a | b | c | d;
            //System.out.println(x == false);
            while (x == false) {
                System.out.println("Что-то не то ты написал. Попробуй ещё раз написать математическое дейсвтие из списка");
                operand2 = scanner.next().charAt(0);
                a = operand2 == 'с';
                b = operand2 == 'в';
                c = operand2 == 'у';
                d = operand2 == 'д';
                x = a | b | c | d;
            }
            //Если прользватель ввёл что-то из списка, продолжаем запрашивать данные. Спрашиваем ещё число
            System.out.println("Отлично! Теперь напиши ещё одно целое число");
            String operand3 = scanner.next();
            //Проверяем, число ли это
            while (!operand3.matches(".*\\d.*")) {
                System.out.println("Это не число. Напиши только цифры, будь милашкой:)");
                operand3 = scanner.next();
            }
            //Если ввёл число, то начинаем математические действия по заданным параметрам
            System.out.println("Круто,ты написал " + operand3 + "! Ща я всё посчитаю. Сек");
            //Переводим числа из стринговых переменных в интовые, чтобы можно было с ними производить мат.действия
            int i = Integer.parseInt(operand1);
            int y = Integer.parseInt(operand3);
            //Производим расчёты согласно тому, какое математическое действие выбрано, выводим на экран
            if (operand2 == 'с') {
                System.out.println(i + y);
            } else if (operand2 == 'в') {
                System.out.println(i - y);
            } else if (operand2 == 'у') {
                System.out.println(i * y);
            } else if (operand2 == 'д') {
                System.out.println(i / y);
            } else
                System.out.println("что-нибудь");

        
    }
}
