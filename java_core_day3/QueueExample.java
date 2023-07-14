package java_core_day3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        int size = queue.size();
        System.out.println(size);
        boolean isEmpty = queue.isEmpty();
        // check if queue is empty
        System.out.println(isEmpty);
        String front_element = queue.peek();
        System.out.println("queue"+ front_element);
        // process queue and kill element in queue
        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println(element);

        }
        // check size  queue after processing
        System.out.println("Queue after"+ queue.size());
    }
}
