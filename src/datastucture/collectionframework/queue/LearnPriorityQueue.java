package datastucture.collectionframework.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    // top element from priority queue: peek method only peek value from queue

    public static void main(String[] args) {
        PriorityQueue<String> employeeName = new PriorityQueue<>();
        // add value
        employeeName.add("Eva");
        employeeName.add("Marion");
        employeeName.add("Emanuel");
        employeeName.add("Erwin");
        employeeName.add("Mala");
        employeeName.peek(); // will peek based on the alphabetic order
        System.out.println(employeeName.peek()); // priority queue works following alphabetic order

        PriorityQueue<Integer> employeeId = new PriorityQueue<>();
        employeeId.add(10);
        employeeId.add(11);
        employeeId.add(5);
        employeeId.add(1);
        System.out.println("************ peek for integer type of data *******");
        for (String str : employeeName){
            System.out.println("st names are "+str);
        }
        // peek method
        employeeId.peek(); // peek from the lowest to largest
        System.out.println("Peek value is : " + employeeId.peek());
        for (Integer in : employeeId) {
            System.out.println(in);
        }
        // poll method
        System.out.println("************ pool method  *******");
        employeeId.poll();
        System.out.println(" poll value is : "+employeeId.poll());
        for (Integer in : employeeId) {
            System.out.println(in);
        }


    }


}
