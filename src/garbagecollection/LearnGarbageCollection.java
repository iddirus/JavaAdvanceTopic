package garbagecollection;

public class LearnGarbageCollection {
    // used for memory management
    // Garbage collection in java means unreferenced objects from heap memory.
    // Garbage Collection is process of reclaiming the runtime unused memory automatically.
    // In other words, it is a way to destroy the unused objects

    // create variables

    String team="Man Utd";
    int creationDate=1889;
    String firstManager="Alex Ferguson";
    int firstTrophy=1902;
    double clubCreationCost=1000000.50;
    int worldRanking=5;

    // create main method
    public static void main(String[] args) {
        LearnGarbageCollection gc = new LearnGarbageCollection();
        System.out.println("Team name is "+gc.team);

        // save our memory by two ways by requesting JVM to run GC
        System.gc();
        Runtime.getRuntime().gc();


    }



}
