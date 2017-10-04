package kz.kaznitu;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("bul zerthanalyktyn maksaty ");
        System.out.println("git pen jumys jasap uirenu");

        int a= Mymath.kvadrat(5);
        int b = Mymath.kub(5);

        System.out.println("a= " +a);
        System.out.println("b= " +b);

        System.out.println(Mymath.max3(8,9, 12));
        System.out.println(Mymath.min3(12,8,15));

    }
}
