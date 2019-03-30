public class findPalindrome {
        int count = 0;
        public int countSubstrings(String s) {


            for(int i=0;i<s.length();i++) {
                findPalindrome(s,i,i);
                findPalindrome(s,i,i+1);
            }
            return count;
        }

        private void findPalindrome(String s, int i, int j) {
            while( i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j) ) {
                count++;
                i--;
                j++;
            }
        }

        public static void main(String args[]) {
            new findPalindrome().countSubstrings("aaa");
        }

    }

