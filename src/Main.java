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
                double number = parseToSixDecimalPlaces(str);

                sum += number;
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.printf("%.6f\n", sum);
        sc.close();
    }

    private static double parseToSixDecimalPlaces(String str) throws NumberFormatException {
        int dotIndex = str.indexOf('.');

        if (dotIndex != -1 && str.length() > dotIndex + 7) {
            return Double.parseDouble(str.substring(0, dotIndex + 7));
        }

        return Double.parseDouble(str);
    }
}
