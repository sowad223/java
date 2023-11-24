import java.util.Scanner;

public class A_new_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            String s = scanner.next();
            int n = s.length();
            int count = 0;

            if (n % 2 == 0 && n > 2) {
                for (int m = 1; m < n / 2 ; m++) {
                    if (s.charAt(m) != s.charAt(m - 1)) {
                        count++;
                        break;
                    }
                }
            } else if (n % 2 != 0 && n > 3) {
                for (int j = 1; j < n / 2; j++) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        count++;
                        break;
                    }
                }
            }

            if (count > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
