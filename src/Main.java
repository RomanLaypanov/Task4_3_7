import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // саздание экземпляра сканера
        String s = scanner.nextLine(); // чтение с клавиатуры символов в стринговую переменную s

        double sum = 0.0; // инциализация дабл переменной sum

        String[] strs = s.split("\\s+"); // разделение строки по пробелам в массив

        for (String str : strs) { // цикл по каждому элементу массива
            try {
                double number = Double.parseDouble(str); // попытка преобразования строки в дабл
                sum += number; // прибравление к сумме
            } catch (NumberFormatException ignored) { // игнорирование исключения
            }
        }

        System.out.printf("%.6f", sum); // вывод итоговой суммы
        scanner.close(); // закрытие сканера
    }
}