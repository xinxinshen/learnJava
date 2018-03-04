public class J_SIngletonExample {
    public static void main(String[] args) {
        J_Singleton a = J_Singleton.mb_getObject();
        J_Singleton b = J_Singleton.mb_getObject();

        if(a == b) {
            System.out.println("the same");
        } else {
            System.out.println("they are different");
        }
    }
}
