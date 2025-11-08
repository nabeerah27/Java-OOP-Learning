package _08_Built_In_Classes;

import java.util.*;

public class _11_Collection_FrameWork_Classes {
    public static void main(String[] args) {

        // ArrayList: dynamic array, allows duplicates
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate allowed
        System.out.println("ArrayList: " + fruits);

        // HashSet: unique elements, unordered
        Set<String> fruitSet = new HashSet<>(fruits);
        System.out.println("HashSet (unique elements): " + fruitSet);

        // LinkedList: allows duplicates, fast insertion/removal
        LinkedList<String> linkedList = new LinkedList<>(fruits);
        linkedList.addFirst("Mango"); // add at start
        linkedList.addLast("Grapes"); // add at end
        System.out.println("LinkedList: " + linkedList);

        // HashMap: key-value pairs, unordered
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        System.out.println("HashMap: " + studentMap);

        // 5️⃣ TreeMap: key-value pairs, sorted by keys
        Map<Integer, String> sortedMap = new TreeMap<>(studentMap);
        System.out.println("TreeMap (sorted by key): " + sortedMap);

        // PriorityQueue: elements ordered by natural ordering
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        System.out.println("PriorityQueue elements removed in order:");
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // retrieves and removes head
        }

        // Notes:
        // - ArrayList is best for random access, LinkedList for insertion/deletion
        // - HashSet/HashMap do not allow duplicates, fast access
        // - TreeSet/TreeMap keep elements sorted
        // - PriorityQueue always retrieves elements in natural order (or comparator)

    }
}
