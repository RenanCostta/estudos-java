package ExQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploQueue02 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        // System.out.println(fila);

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }





    }
}
