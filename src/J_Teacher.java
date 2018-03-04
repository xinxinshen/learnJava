class J_Employee {
    public int m_workYear;

    public J_Employee(){
        m_workYear = 1;
    }
    public void mb_printInfo() {
        System.out.println("This employee's work year is " + m_workYear);
    }
}

public class J_Teacher extends J_Employee {
    public int m_classHour;

    public J_Teacher(){
        m_classHour = 96;
    }

    public void mb_printInfo() {
        System.out.println("This teacher's work year is " + m_workYear);
        System.out.println("This teacher's class hour is " + m_classHour);
    }

    public static void main(String args[]) {
        J_Teacher tom = new J_Teacher();
        tom.mb_printInfo();
        J_Employee a = new J_Employee();
        a.mb_printInfo();

    }
}


