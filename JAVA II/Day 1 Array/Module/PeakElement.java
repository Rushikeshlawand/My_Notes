package Module;

public class PeakElement {
    public static void main(String[] args) {
        int[]array={1, 1, 1, 2, 1, 1, 1};
        int n= array.length;
        int Start=1,End= n-1;

        while (Start<End){
            int Mid=Start+(End-Start)/2;
            if (array[Mid] < array[Mid+1]){
                Start=Mid+1;
            }else {
                End=Mid-1;
            }
        }
        System.out.println("Peak element index: "+ Start);
        System.out.println("peak element is:"+ array[Start]);
    }
}