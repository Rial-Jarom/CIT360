import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        // SETS
        // HashSet
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("William");
        myHashSet.add("Elizabeth");
        myHashSet.add("Leonard");
        myHashSet.add("Adalade");
        myHashSet.add("Daniel");
        myHashSet.add("Lydia");
        System.out.println();
        System.out.println(" HashSet Example");
        System.out.println("\t" + myHashSet);
        // TreeSet
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("William");
        myTreeSet.add("Elizabeth");
        myTreeSet.add("Leonard");
        myTreeSet.add("Adalade");
        myTreeSet.add("Daniel");
        myTreeSet.add("Lydia");
        System.out.println();
        System.out.println(" TreeSet Example");
        System.out.println("\t" + myTreeSet);

        // LISTS
        // LinkedList
        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("William");
        myLinkedList.add("Elizabeth");
        myLinkedList.add("Leonard");
        myLinkedList.add("Adalade");
        myLinkedList.add("Daniel");
        myLinkedList.add("Lydia");
        myLinkedList.remove("Leonard");
        System.out.println();
        System.out.println(" LinkedList Example");
        System.out.println("\t" + myLinkedList);
        // ArrayList
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("William");
        myArrayList.add("Elizabeth");
        myArrayList.add("Leonard");
        myArrayList.add("Adalade");
        myArrayList.add("Daniel");
        myArrayList.add("Lydia");
        myArrayList.remove(2);
        System.out.println();
        System.out.println(" ArrayList Example");
        System.out.println("\t" + myArrayList);

        // MAPS
        // HashMap
        Map<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("William", 1865);
        myHashMap.put("Elizabeth", 1809);
        myHashMap.put("Leonard", 1906);
        myHashMap.put("Adalade", 1874);
        myHashMap.put("Daniel", 1738);
        myHashMap.put("Lydia", 1824);
        System.out.println();
        System.out.println(" HashMap Example");
        System.out.println("\t" + myHashMap);
        // TreeMap
        Map<String, Integer> myTreeMap = new TreeMap();
        myTreeMap.put("William", 1865);
        myTreeMap.put("Elizabeth", 1809);
        myTreeMap.put("Leonard", 1906);
        myTreeMap.put("Adalade", 1874);
        myTreeMap.put("Daniel", 1738);
        myTreeMap.put("Lydia", 1824);
        System.out.println();
        System.out.println(" TreeMap Example");
        System.out.println("\t" + myTreeMap);

        // QUEUES
        // Queue
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1738);
        myQueue.add(1809);
        myQueue.add(1824);
        myQueue.add(1865);
        myQueue.add(1874);
        myQueue.add(1906);
        System.out.println();
        System.out.println(" Queue Example");
        System.out.println("\t" + myQueue);
        System.out.println(" Head - " + myQueue.peek());
        System.out.println(" Size - " + myQueue.size());

        // TREES
        // See TreeSet and TreeMap
    }
}
