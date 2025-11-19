import java.util.TreeSet;
import java.util.Set;
// Demonstrate TreeSet.
class TreeSetDemo {
public static void main(String args[]) {
// Create a TreeSet of Strings
Set<String> set = new TreeSet<>();
// 1. add() - elements are added in sorted order
set.add("E");
set.add("A");
set.add("C");
set.add("B");
System.out.println("Content (sorted alphabetically): " + set);
// 2. check if empty
System.out.println("Is set empty? " + set.isEmpty());
// 3. iterating (demonstrates order)
System.out.print("Iterating in order: ");
for(String element : set) {
System.out.print(element + " ");
}
System.out.println();
}
}
