import java.util.Scanner;
public class Love_story_cf {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        for (int i=0; i<t;i++)
        {
            String m = "codeforces";
            int n = m.length();
            String k = s.next();
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (k.charAt(j)!= m.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(count);
        }


    }

}
