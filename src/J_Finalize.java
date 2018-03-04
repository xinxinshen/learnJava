public class J_Finalize {
    public static void main (String[] args){
        J_Book book1 = new J_Book(1);
        new J_Book(2);
        new J_Book(3);
        System.gc();
    }
}

class J_Book {
    public int m_id;

    public J_Book(int i) {
        m_id = i;
    }

    protected void finalize() {
        switch(m_id){
            case 1:
                System.out.println("<<piao>>");
                break;
            case 2:
                System.out.println("<<Java>>");
                break;
            case 3:
                System.out.println("Rome");
                break;
            default:
                System.out.println("unknown");
                break;
        }
        System.out.println("huishou");
    }
}
