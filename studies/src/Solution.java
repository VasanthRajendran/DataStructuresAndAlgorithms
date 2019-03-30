

import java.util.*;

public class Solution {

    public void test(String s) {

    char[] c = new char[]{'c','c','a','a','b'};
        char[] c2 = new char[]{'c','a','b','c'};
        int sum1 = 0;
        int sum2 = 0;
        for(char ch:c) {
            sum1 += ch - 'a';
        }
        for(char ch:c2){
            sum2 += ch-'a';
        }

        int missingnum = sum1 - sum2;

        char miss = (char) ('a' + missingnum);

        System.out.println(miss);
//       int a = Arrays.asList(arr).indexOf('t');
//        int b = Arrays.asList(arr).lastIndexOf('e');

    }


    public static void main(String[] args) {
        Solution s= new Solution();
        s.test("test");
    }
}