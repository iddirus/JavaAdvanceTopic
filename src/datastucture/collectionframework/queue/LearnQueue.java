package datastucture.collectionframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    // Queue: FIFO order : first in first out

    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        // add values+
        names.add("Michael");
        names.add("Jordan");
        names.add("Steven");
        names.add("Segal");
        names.add("Maria");
        names.add("Carey");
        // Get the size
        System.out.println("the size is : " + names.size());
        // print names
        System.out.println(names);
        // print single value
        for (String st : names) {
            System.out.println(st);
        }

        // poll: catch and remove
        // peek: do only catch/ call but not remove

        System.out.println("******** after poll ******************");
        // pool
        names.poll(); // it will poll the first value which is "Michael" and remove it from the list
        for (String st : names) {
            System.out.println(st);
        }
        System.out.println("******** after peek ******************");
        // peek method
        names.peek();
        System.out.println("peek value is : " + names.peek());
        for (String st : names) {
            System.out.println(st);
        }

    }
}
