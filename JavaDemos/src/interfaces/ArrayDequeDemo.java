package interfaces;
import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("Chocolate");
        dq.addFirst("Ice cream");
        dq.addLast("Biscuit");
 
        System.out.println(dq);
    }
}
