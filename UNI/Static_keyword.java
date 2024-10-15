public class Static_keyword {
    static int a = 0;
    int bc;

    Static_keyword(int b) {
        a++;
        bc = b;

    }

}

class run {
    public static void main(String[] args) {
        System.out.println(Static_keyword.a);
        Static_keyword abc = new Static_keyword(20);
        System.out.println(abc.a);
        Static_keyword abc2 = new Static_keyword(33);
        System.out.println(abc2.a);
        System.out.println(abc.a);

    }
}