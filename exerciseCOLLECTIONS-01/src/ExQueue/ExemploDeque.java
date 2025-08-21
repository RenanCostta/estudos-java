package ExQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploDeque {
    public static void main(String[] args) {

        System.out.println("****** ACESSANDO ******");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("Blue");
        deque.add("White");
        deque.add("Yellow");
        deque.add("Black");

        Deque<String> deque2 = new ArrayDeque<String>();
        deque2.add("Green");
        deque2.add("Orange");

        deque.addAll(deque2);

        System.out.println(deque);

        // Others methods

        


    }
}
