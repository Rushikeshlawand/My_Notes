public class PeakElement {
    public static void main(String[] args) {
        int[]array={1, 1, 1, 2, 1, 1, 1};
        int Start=1,End= array.length-1,Mid=0;

        while (Start<End){
            Mid=Start+(End-Start)/2;
            if (array[Mid]<array[Mid+1]){
                System.out.println(Start=Mid+1);
            }else {
                System.out.println(End=Mid-1);
            }
        }
    }
}