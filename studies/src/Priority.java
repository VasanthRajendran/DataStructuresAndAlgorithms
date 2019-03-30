
import java.util.*;
public class Priority {

    public static void main(String args[]) {
        int a =10;
        int b=20;
        int c=5;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        while(!pq.isEmpty())
           System.out.println(pq.poll());
//        Iterator itr = pq.iterator();
//        System.out.println(pq);
//        while (itr.hasNext())
//            System.out.println(itr.next());
    }
}
