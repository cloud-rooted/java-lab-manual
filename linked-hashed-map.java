import java.util.LinkedHashMap;
import java.util.Map;
// Demonstrate LinkedHashMap (maintains insertion order).
class LinkedHashMapDemo {
public static void main(String args[]) {
// Create a LinkedHashMap
Map<String, Double> lhm = new LinkedHashMap<>();
// 1. put() elements
lhm.put("John Doe", 3434.34);
lhm.put("Tom Smith", 123.22);
lhm.put("Jane Baker", 1378.00);
System.out.println("LinkedHashMap maintains insertion order:");
// 2. Iteration order is the insertion order
for (Map.Entry<String, Double> entry : lhm.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
// 3. get()
System.out.println("\nJohn Doe's balance: " + lhm.get("John Doe"));
}
}
