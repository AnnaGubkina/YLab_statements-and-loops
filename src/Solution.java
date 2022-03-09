import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        //Задачи на условные операторы

        //1. Минимум двух чисел
        System.out.println("Введите 2 числа: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (b < a) {
            System.out.println(b);
        }
        if (a < b) {
            System.out.println(a);
        }
        if (a == b) {
            System.out.println(b);
        }

        //2.Максимум четырех чисел
        //Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        System.out.println("Введите 4 числа: ");
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();

        int x = Math.max(Math.max(c, d), Math.max(e, f));
        System.out.println(x);

        //3.Ввести с клавиатуры три числа, и вывести их в порядке убывания.
        System.out.println("Введите 3 числа: ");
        int[] array = new int[3];

        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();

        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }

        //4. Сравнить имена
        System.out.println("Введите 2 имени: ");
        String name1 = scan.nextLine();
        String name2 = scan.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        }
        else if(name1.length() == name2.length() && name1 != name2) {
            System.out.println("Длины имен равны");
        }

        //5. Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if(age < 18) {
            System.out.println("Подрасти еще");
        }

        //6. Ввести с клавиатуры имя и возраст.
        //Если возраст больше 20 вывести надпись «И 18-ти достаточно»
        Scanner scanner1 = new Scanner(System.in);
        String nameOfUser = scanner1.nextLine();
        int age1 = scanner1.nextInt();
        if(age1 > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
