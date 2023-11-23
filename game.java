import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n > 4) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}

