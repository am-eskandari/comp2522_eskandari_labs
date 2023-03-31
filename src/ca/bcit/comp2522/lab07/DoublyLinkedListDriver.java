package ca.bcit.comp2522.lab07;

/**
 * The DoublyLinkedListDriver class tests the DoublyLinkedList implementation with various method calls.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public final class DoublyLinkedListDriver {
    private DoublyLinkedListDriver() { }
    /**
     * The main method creates a DoublyLinkedList object and tests its methods.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        // Test the prepend method
        list.prepend("apple");
        list.prepend("banana");
        list.prepend("cherry");
        System.out.println("List after prepend: " + list);

        // Test the append method
        list.append("date");
        list.append("elderberry");
        list.append("fig");
        System.out.println("List after append: " + list);

        // Test the add method
        list.add("grape", 2);
        list.add("honeydew", 5);
        System.out.println("List after add: " + list);

        // Test the size method
        System.out.println("List size: " + list.size());

        // Test the get method
        System.out.println("Element at index 3: " + list.get(3));

        // Test the remove method
        list.remove(1);
        list.remove(4);
        System.out.println("List after remove: " + list);

        // Test the clear method
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
