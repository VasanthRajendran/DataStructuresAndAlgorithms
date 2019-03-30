import java.util.HashMap;
import java.util.Map;

public class MinSliding {

    public String minWindow(String s, String t) {
        if(t.length() > s.length() || s == null || s.length() == 0) {
            return "";
        }



        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++) {
            if(map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i),map.get(t.charAt(i)) + 1);
            } else {
                map.put(t.charAt(i), 1);
            }
        }
        int left = 0;
        int count = 0;
        int min = s.length()+1;
        int minleft = 0;
        for(int right = 0;right < s.length();right++) {
            if(map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
                if(map.get(s.charAt(right)) >= 0) {
                    count++;
                }
            }

            while(count == t.length()) {
                if(right - left+1 < min) {
                    minleft = left;
                    min = right - left + 1;
                }
                if(map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left))+1);
                    if(map.get(s.charAt(left)) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        return min > s.length() ? "":s.substring(minleft,minleft+min);

    }



    public static void main(String[] args) {
        MinSliding m = new MinSliding();
        String S = "aa", T = "aa";
        System.out.println(m.minWindow(S, T));
    }
}