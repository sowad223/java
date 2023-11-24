import java.util.Scanner;
public class word_on_the_paper {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            for (int testCase = 0; testCase < t; testCase++) {
                StringBuilder[] rows = new StringBuilder[8];

                for (int i = 0; i < 8; i++) {
                    String row = scanner.next().trim();
                    rows[i] = new StringBuilder();
                    for (int j = 0; j < row.length(); j++) {
                        if (row.charAt(j) != '.') {
                            rows[i].append(row.charAt(j));
                        }
                    }
                }

                StringBuilder k = new StringBuilder();
                for (StringBuilder row : rows) {
                    k.append(row);
                }

                System.out.println(k.toString());
            }
        }

}

