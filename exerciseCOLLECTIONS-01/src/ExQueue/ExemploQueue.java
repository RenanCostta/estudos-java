package ExQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        //ordenação natural

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("long");
        queue.add("medium");

        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }

}
