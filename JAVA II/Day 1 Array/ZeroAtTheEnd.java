public class ZeroAtTheEnd {
    public static void main(String[] args) {
        int[]runs={124,2,0,45,0,34,0,0,3,223};
        int n= runs.length;
        int j=0;
        for (int i=0;i<n;i++){
            if(runs[i]!=0){
                if (i!=j){
                    runs[j]=runs[i];
                    runs[i]=0;
                }
                j++;
            }
        }
        for (int k=0;k<n;k++){
        System.out.println(runs[k]);
        }
    }
}
