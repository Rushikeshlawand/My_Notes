public class recursion {

    void fun(int x) {
        if (x == 10)
            return;
        System.out.println(x);
        fun(x + 1);
    }
    public static void main(String[] args) {
        recursion obj = new recursion();
        obj.fun(0);
    }
}