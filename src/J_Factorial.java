public class J_Factorial {
    public static void main(String[] args){
        int i;
        int result;

        result = 1;
        for(i = 1; i <= 10; i++) {
            result *= i;
        }

        System.out.println("10!=" + result);

        double x = 1.0 + 4/5.0 + 5.2/2.5;
        System.out.println(x);

        int a = 12;
        System.out.println((++a)+(a++));
        System.out.println(10 & 11 | 12);
        System.out.println(5 ^ 7);
        System.out.println((-5)|(~5));
        System.out.println((true ^ false) && true);

    }
}
