package TH1;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int[][] dp = new int[n + 5][n + 5];
            for(int i = 0; i < n + 5; i++){
                for(int j = 0; j < n + 5; j++){
                    dp[i][j] = 0;
                }
            }
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(s.charAt(i - 1) == s.charAt(j - 1) && i != j){
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            System.out.println(dp[n][n]);
        }
        
    }
}
//2
//3
//abc
//5
//axxxy