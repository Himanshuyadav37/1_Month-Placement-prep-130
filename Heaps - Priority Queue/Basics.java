import java.util.Comparator;
import java.util.PriorityQueue;

class Basics {
    public static void main(String[] args) {

        // 1. Normal PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);    //O(logn)
        pq.add(2);
        pq.add(4);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.print(pq.remove() +  " ");
        }

        System.out.println();


        // 2. Reverse
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());

        pqr.add(3);    //O(logn)
        pqr.add(2);
        pqr.add(4);
        pqr.add(1);

        while(!pqr.isEmpty()){
            System.out.print(pqr.remove() +  " ");
        }
    }
}


//add -> O(logn)
//peek() -> O(1)
// remove() -> O(logn)