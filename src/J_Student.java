public class J_Student {
    public int m_id;
    public int m_age;

    public J_Student(){
        mb_setData(2008010400, 19);
    }

    public void mb_setData(int id, int age) {
        m_id  = id;
        m_age = age;
    }

    public J_Student(int id, int age) {
        m_id  = id;
        m_age = age;
    }

    public void mb_setData(int id) {
        m_id = id;
    }

    public static void main(String[] args) {
        J_Student jack = new J_Student();
        jack.mb_setData(2008010401);
        J_Student lisa = new J_Student();
        lisa.mb_setData(2018010122, 14);
        System.out.print("jack's id is " + jack.m_id);
        System.out.println(", age is " + jack.m_age);
        System.out.print("lisa's id is " + lisa.m_id);
        System.out.println(", age is " + lisa.m_age);
    }
}
