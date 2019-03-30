public class MultiplyWithout {


        public int divide(int dividend, int divisor) {
            int sign = ((dividend < 0) ^ (divisor < 0)) ? -1:1;
            long quotient = 0;

            long longDividend = Math.abs((long) dividend);
            long longDivisor = Math.abs((long)divisor);
            while(longDividend >= longDivisor) {
                // if(quotient >= Integer.MAX_VALUE) {
                //     return Integer.MAX_VALUE;
                // }

                quotient++;
                longDividend -= longDivisor;
            }
            return sign * (int) quotient;
        }
    public static void main(String[] args) {
            new MultiplyWithout().divide(-2147483648,843657);
    }
}