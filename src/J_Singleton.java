public class J_Singleton {
    private static J_Singleton m_object ;
    private J_Singleton(){}

    public static J_Singleton mb_getObject() {
        if(m_object == null) {
            m_object = new J_Singleton();
        }
        return m_object;
    }
}
