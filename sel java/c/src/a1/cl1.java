package a1;

public class cl1 {
    static void q1(){

        System.out.println("qwertyuiop");
    }
    static String q2(String a){
        return a;
    }
    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        q1();
        String v=q2("xcvbn");
        int a=add(4,5);
        System.out.println(a);
        System.out.println(v);
    }
}
