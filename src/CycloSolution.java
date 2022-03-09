import java.util.Scanner;

public class CycloSolution {

    //задачи на циклы

    public static void main(String[] args) {

        // 1. Вывести на экран от 1 до 10

        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        // 2. 10 чисел наоборот
        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }

        //3.Ввести с клавиатуры строку и число N.
        //Вывести на экран строку N раз, используя цикл while.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        while (n > 0) {
            System.out.println(str);
            n--;

        }

        //4.S-квадрат.
        //Вывести на экран квадрат из 10х10 букв S используя цикл while.
        //Буквы в каждой строке не разделять.
        int x = 1, y = 1;
        while (y <= 10) {
            while (x < 10) {
                System.out.print("S");
                x++;
            }
            System.out.println("S");
            y++;
            x = 1;
        }

        //5.  Таблица умноження
        int a = 1;
        int b = 1;
        while (a < 11) {
            while (b < 11) {
                System.out.print(a * b + " ");
                b++;
            }
            a++;
            b = 1;
            System.out.println();
        }
    }
}
