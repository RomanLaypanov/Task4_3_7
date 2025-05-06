import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        double sum = 0.0;

        scanner = new Scanner(s);

        while (scanner.hasNext()) {
            String str = scanner.next();

            double number = Double.parseDouble(str);
            sum += number;
        }

        System.out.printf("%.6f", sum);
        scanner.close();
    }
}