public class J_Boolean {
    public static void main(String args[]){
        int month = 8;
        int day   = 1;
        if((month == 8) || ++day < 15){
            System.out.println("Month=" + month + ", Day=" + day);
        }
        if((month == 8) | ++day < 15){
            System.out.println("Month=" + month + ", Day=" + day);
        }
    }
}
