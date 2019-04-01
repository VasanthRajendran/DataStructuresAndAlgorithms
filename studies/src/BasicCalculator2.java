import java.util.Stack;

public class BasicCalculator2 {

        public int calculate(String s) {
            int len;
            if(s==null || (len = s.length())==0) return 0;
//            Stack<Integer> stackTest = new Stack<Integer>();
//            stackTest.push(1);
//            stackTest.push(2);
//            stackTest.push(3);
//            for(int i:stackTest) {
//                System.out.println(i);
//            }
//            int n = stackTest.size();
//            for(int i=0;i<n;i++) {
//                System.out.println(stackTest.pop());
//            }


            Stack<Integer> stack = new Stack<Integer>();
            int num = 0;
            char sign = '+';
            for(int i=0;i<len;i++){
                if(Character.isDigit(s.charAt(i))){
                    num = num*10+s.charAt(i)-'0';
                }
                if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
                    if(sign=='-'){
                        stack.push(-num);
                    }
                    if(sign=='+'){
                        stack.push(num);
                    }
                    if(sign=='*'){
                        stack.push(stack.pop()*num);
                    }
                    if(sign=='/'){
                        stack.push(stack.pop()/num);
                    }
                    sign = s.charAt(i);
                    num = 0;
                }
            }

            int re = 0;
            for(int i:stack){
                re += i;
            }
            return re;
        }

        public static void main(String[] args) {
            new BasicCalculator2().calculate("3+5/2");
        }
}
