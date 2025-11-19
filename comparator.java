import java.util.Comparator;
import java.util.TreeSet;
// A custom Comparator that sorts Strings in reverse order.
class ReverseStringComparator implements Comparator<String> {
public int compare(String a, String b) {
// Reverse the natural order comparison
return b.compareTo(a);
}
}
class ComparatorDemo {
public static void main(String args[]) {
// Create a TreeSet that uses the custom Comparator
TreeSet<String> ts = new TreeSet<>(new ReverseStringComparator());
// Elements are inserted
ts.add("A");
ts.add("B");
ts.add("C");
ts.add("Z");
// The output will be in reverse alphabetical order
System.out.println("TreeSet sorted by custom Comparator (reverse
order):");
System.out.println(ts);
}
}
