import java.util.ArrayList;
import java.util.ListIterator;
// Demonstrate ListIterator.
class ListIteratorDemo {
public static void main(String args[]) {
ArrayList<String> al = new ArrayList<>();
al.add("C");
al.add("A");
al.add("E");
al.add("B");
// Obtain a ListIterator
ListIterator<String> litr = al.listIterator();
System.out.println("Traversing forward:");
// 1. Traverse forward and modify elements
while(litr.hasNext()) {
String element = litr.next();
System.out.print(element + " ");
if(element.equals("A")) {
litr.set("A_Modified"); // 2. set()
}
}
System.out.println("\nModified list: " + al);
System.out.println("Traversing backward (after modification):");
// 3. Traverse backward
while(litr.hasPrevious()) {
String element = litr.previous();
System.out.print(element + " ");
}
System.out.println();
}
}
