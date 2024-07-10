public class recursion {

    void fun(int x) {
        if (x> 100)
            return;
        fun(x + 1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        recursion obj = new recursion();
        obj.fun(1);
    }
}