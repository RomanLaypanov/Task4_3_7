import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        double sum = 0.0;

        Scanner sc = new Scanner(s);

        while (sc.hasNext()) {
            String str = sc.next();

            try {
                double number = Double.parseDouble(str);

                sum += number;
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.printf("%.6f", sum);
        sc.close();
    }
}