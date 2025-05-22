import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;


        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextDouble()) {
                sum +=  Double.parseDouble(scanner.next());
            } else {
                scanner.next();
            }
        }

        System.out.printf("%.6f", sum);
        scanner.close();
    }
}
