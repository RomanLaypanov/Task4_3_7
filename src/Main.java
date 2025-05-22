import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;


        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += Double.parseDouble(scanner.next());
            } else {
                scanner.next();
            }
        }

        System.out.printf("%.6f", sum);
        scanner.close();
    }
}
