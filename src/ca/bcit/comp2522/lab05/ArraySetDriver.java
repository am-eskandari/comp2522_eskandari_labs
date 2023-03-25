package ca.bcit.comp2522.lab05;

/**
 * ArraySetDriver is a simple driver class to test the functionality of ArraySet class.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class ArraySetDriver {
    public static void main(String[] args) {
        ArraySet<Integer> set = new ArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size()); // Output: 3
        System.out.println(set.contains(2)); // Output: true
        System.out.println(set.contains(4)); // Output: false
        set.remove(2);
        System.out.println(set.size()); // Output: 2
        System.out.println(set.contains(2)); // Output: false
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        System.out.println(set.size()); // Output: 11
        System.out.println(set.contains(11)); // Output: true
        System.out.println(set.contains(12)); // Output: false
    }
}
