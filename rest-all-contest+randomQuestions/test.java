import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        String str[][] = new String[t][2];
        int i = 0;
        while (i < t) {
            str[i][0] = m.next();
            str[i][1] = m.next();
            i++;
        }
        i = 0;
        while (i < t) {
            String text1=str[i][0];
            String text2=str[i][1];
            int dp[][] = new int[text1.length() + 1][text2.length() + 1];
            //int n = text1.length();
            //int m = text2.length();
            for (int ii = 1; ii < text1.length() + 1; ii++) {
                for (int j = 1; j < text2.length() + 1; j++) {
                    int x = ii - 1;
                    int y = j - 1;
                    if (text1.charAt(x) == text2.charAt(y)) {
                        dp[ii][j] = Math.max(Math.max(1 + dp[ii - 1][j - 1], dp[ii - 1][j]), dp[ii][j - 1]);
                    } else {
                        dp[ii][j] = Math.max(dp[ii - 1][j], dp[ii][j - 1]);
                    }
                }
            }
            int temp = dp[text1.length()][text2.length()];
            int ans=text1.length()+text2.length()-temp;
            System.out.println(ans);
            i++;
        }
        m.close();
    }
}