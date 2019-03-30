public class WildCard
{

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[p.length()+1][s.length()+1];
        dp[0][0]=true;
        for(int i=1;i<=p.length();i++){
            if(p.charAt(i-1) == '*' && dp[i-1][0]){
                dp[i][0]=true;
            }
        }
        for(int i=1;i<=p.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(j-1) == p.charAt(i-1) || p.charAt(i-1) == '?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(i-1) == '*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
            }
        }
        return dp[p.length()][s.length()];
    }

    public static void main(String args[]) {
        WildCard w = new WildCard();
        System.out.println(w.isMatch("cadceb","*a*"));
    }
}