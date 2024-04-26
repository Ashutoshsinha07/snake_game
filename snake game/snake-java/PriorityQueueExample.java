import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(9);
        priorityQueue.add(7);
        priorityQueue.add(7);
        priorityQueue.add(2);
        
        System.out.println("Priority Queue: " + priorityQueue);
        priorityQueue.remove(2);
        System.out.println("Priority Queue after removing 2: " + priorityQueue);
        
        // Adding name and ID to the output
        String name = "Ashutosh Sinha";
        String id = "1000018018";
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
