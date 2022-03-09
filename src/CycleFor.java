import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CycleFor {

    public static void main(String[] args) throws IOException {

        //1.Четные числа
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //2.Рисуем прямоугольник
        //Ввести с клавиатуры два числа m и n.
        //Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("8");
            }
            System.out.print("" + "\n");
        }

        //3.Рисуем треугольник
        //Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
        for (int i = 1; i <= 10; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("8");
            }
            System.out.println();
        }

        //4.Рисуем линии
        for (int i = 1; i <= 10; i++)
            System.out.print("8");

        System.out.println();

        for (int i = 1; i <= 10; i++)
            System.out.println("8");

        //5. Все любят Мамбу
        //Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }

        //Дополнительные задания к лекции 4
        //1.Используя цикл вывести на экран сто раз надпись:
        //«Я никогда не буду работать за копейки. Амиго»
        for (int i = 0; i < 100; i++) {
            System.out.println("Я никогда не буду работать за копейки. Амиго");
        }

        //2. Среднее такое среднее
        //Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
        System.out.println("Введите 3 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int average = 0;
        if (a == b || a == c || b == c) {
            System.out.println("Введите все три числа разные!");
        } else if (a > b && a < c) {
            average = a;
        } else if (b > a && b < c) {
            average = b;
        } else if (c > a && c < b) {
            average = c;
        }
        System.out.println("Среднее из введённых чисел:" + average);

        // 3. Посчитать сумму чисел
        //Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int aa;
        int bb = 0;

        do {
            String read = reader1.readLine();
            aa = Integer.parseInt(read);
            bb += aa;
        } while (aa != -1);

        System.out.println(bb);

        //4.Ввести с клавиатуры строку name.
        //Ввести с клавиатуры дату рождения (три числа): y, m, d.
        //Вывести на экран текст:
        //«Меня зовут name
        //Я родился d.m.y»
        String nameMy = scanner.nextLine();
        int y = scanner.nextInt();
        int m1 = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("Меня зовут " + name + "\nЯ родился " + d + "." + m1 + "." + y);

    }
}
