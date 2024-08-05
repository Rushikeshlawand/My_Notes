public class rough {

    public static void main(String[] args) {
        int[]arr={1,0,0,0,0,1};
        int n=2;
        int nn=n*2;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count++;
            }
        }
        if (count==nn) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}