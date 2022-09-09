package task;

import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        priorityQueue.add("prince");
        priorityQueue.add("anand");
        priorityQueue.add("chetan");
        priorityQueue.add("yash");
        System.out.println("First Priority Queue: "+priorityQueue);
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>();
        priorityQueue2.add("anand");
        priorityQueue2.add("dikshita");
        priorityQueue2.add("chetan");
        priorityQueue2.add("prince");
        System.out.println("Second Priority Queue: "+priorityQueue2);
        //comparison output in Priority Queue
        for (String element : priorityQueue){
            System.out.println(priorityQueue2.contains(element) ? "its Present" : "Absent");
        }
    }
}
