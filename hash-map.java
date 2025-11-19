import java.util.HashMap;
import java.util.Map;
// Demonstrate HashMap (no order guarantee).
class HashMapDemo {
public static void main(String args[]) {
// Create a HashMap
Map<String, Double> hm = new HashMap<>();
// 1. put() elements
hm.put("John Doe", 3434.34);
hm.put("Tom Smith", 123.22);
hm.put("Jane Baker", 1378.00);
System.out.println("HashMap does not guarantee order:");
// 2. Iteration order is unpredictable
for (Map.Entry<String, Double> entry : hm.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
// 3. size()
System.out.println("\nMap size: " + hm.size());
}
}
