package Module;

public class MaxOrMinElement {
    public static void main(String[] args) {
        int[]Array={10,100,100,10,101,100};
        int n= Array.length,max=Array[0],min=Array[0];

        for (int i=0;i<n;i++){
            if (Array[i]>max){
               max=Array[i];
            } else if (Array[i]<min) {
                min=Array[i];
            }
        }
        System.out.println("Max number is: "+max+","+"Minimum number is: "+min);
    }
}
