import java.util.WeakHashMap;

public class J_WeakHashMap {
    public static void main(String[] args) {
        int s = 800;

        WeakHashMap<String, String> ht = new WeakHashMap<String, String>(s*4/3, 0.75f);

        int i;
        for(i = 0; i < s; i++) {
            ht.put("key"+i, "value"+i);
        }

        System.out.println(ht.size());

        for(i = 0; i < s; ) {
            if(!ht.containsKey("key" + i)) {
                System.out.print("key" + i + "; ");
            }
            if(ht.size() != s) {
                i++;
            }
        }
        System.out.println("");
        System.out.println(ht.size());
    }
}
