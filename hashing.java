import java.util.*;
public class hashing {
    //hashing basics
    public static void hashmap() {
        HashMap<Integer, String> hm = new HashMap<>();
        //Add key value pairs
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        //clone a hashmap
        HashMap<Integer, String> hm2 = new HashMap<>(hm);
        System.out.println(hm2.keySet());
        //update a key value pair
        hm.put(1, "Three");
        //prints full hashmap
        System.out.println("Full HashMap : " + hm.toString());
        //remove a key value pair
        System.out.println("Removing 2nd key-value pair : " + hm.remove(2));
        //hashmap size
        System.out.println("HashMap Size : " + hm.size());
        //check if a key exists
        System.out.println("Checking if 2nd key exists : " + hm.containsKey(2));
        //get value of a key
        System.out.println("Get value of a 1st key : " + hm.get(1));
        //prints final hashmap after certain operations
        System.out.println("Final Hashmap after ops : " + hm.toString());
        System.out.println("Cloned HashMap : " + hm2.toString());
    }

    public static void hashset() {
        HashSet<String> hs = new HashSet<>();
        //Add elements
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        //add duplicate element
        hs.add("One");        
        //prints full hashset
        System.out.println("Full HashSet : " + hs.toString());
        //clone a hashset
        HashSet<String> hm2 = new HashSet<>(hs);
        //remove a key pair
        System.out.println("Removing 2nd key pair : " + hs.remove("Two"));
        //hashmap size
        System.out.println("HashMap Size : " + hs.size());
        //check if a key exists
        System.out.println("Checking if 2nd key exists : " + hs.contains("2"));
        System.out.println("Checking if 2nd key exists : " + hs.contains("One"));
        //Access Elements/Keys
        int count = 0;
        for (String string : hs) {
            System.out.println("Element "+ count +" : " + string);
            count++;
        }
        //prints final hashset
        System.out.println("Final HashSet after ops : " + hs.toString());
        System.out.println("Cloned HashSet : " + hm2.toString());
    }

    public static void main(String[] args) {
        hashmap();
        hashset();
    }
}