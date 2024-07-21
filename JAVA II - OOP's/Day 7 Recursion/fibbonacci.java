public class fibbonacci {
    int a=0;
    int b=1;
    void fib(int x) {
        if(x==10)
        return;
        int num=a+b;
        System.out.println(num);
        a=b;
        b=num;
        fib(x+1);
    }
    public static void main(String[] args) {
     fibbonacci obj=new fibbonacci();  
     System.out.println(0);
     System.out.println(1);
    obj.fib(1);
    }
}