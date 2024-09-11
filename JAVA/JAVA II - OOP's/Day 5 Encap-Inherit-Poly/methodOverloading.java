public class methodOverloading {
    int add(int a,int b){
        return a+b;
    }

    float add(float a,float t){
        return a+t;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        methodOverloading obj=new methodOverloading();
        System.out.println(obj.add(12,12));
        System.out.println( obj.add(66.9f, 22.2f));
        System.out.println(obj.add(112,1112,22));
        System.out.println(obj.add(121,112,1,2));
    }
}