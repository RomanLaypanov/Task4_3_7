import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        double sum = 0.0;

        String[] strs = s.split("\\s+");

        for (String str : strs) {
            try {
                double number = Double.parseDouble(str);
                sum += number;
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.printf("%.6f", sum);
        scanner.close();
    }
}