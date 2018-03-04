import java.util.Hashtable;

public class J_HashTable {
    public static void main(String[] args) {
        String [] sa = {"Mary", "Tom", "John", "James", "Louis", "Jim"};
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

        int i;
        for(i = 0; i < sa.length; i++) {
            ht.put(sa[i], new Integer(i));
        }

        i = 4;
        System.out.println(sa[i]);
        String s = sa[i];
        System.out.println(ht.get(s));
    }
}

