import java.util.Arrays;

public class Siddharth {


    public int[] merge(int[] a, int[] b) {


        int j = b.length - a.length - 1;

        int last = b.length - 1;

        int i = a.length - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                b[last] = a[i];
                i--;
            } else {
                b[last] = b[j];
                j--;
            }
            last--;

        }
        while(i >= 0){
            b[last] = a[i];
            i--;
        }


        return b;

    }


    public static void main(String args[]) {

        Siddharth s = new Siddharth();

        int a[] = {1,3,5};

        int b[] = {2,4,6, -1, -1, -1};

        s.merge(a, b);

        for (int i = 0; i < b.length; i++) {

            System.out.println(b[i]);

        }

    }


}