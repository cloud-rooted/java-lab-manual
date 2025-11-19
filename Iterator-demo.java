import java.util.ArrayList;
import java.util.Iterator;
// Demonstrate Iterator.
class IteratorDemo {
public static void main(String args[]) {
ArrayList<String> al = new ArrayList<>();
al.add("C");
al.add("A");
al.add("E");
al.add("B");
// Obtain an Iterator
Iterator<String> itr = al.iterator();
System.out.print("Original contents of al: ");
// Iterate through the elements
while(itr.hasNext()) {
String element = itr.next();
System.out.print(element + " ");
// Example of using remove()
if(element.equals("A")) {
itr.remove();
}
}
System.out.println("\nContents after removing 'A': " + al);
}
}
