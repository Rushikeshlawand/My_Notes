import java.util.*;
class MinOrMaxArray {
    public static void main(String[] args) {
       int[]array={1,2,3,41,44};
       int n= array.length;
       int max= array[0];
        for (int i=1;i<n;i++){
           if (array[i]>max){
               max=array[i];
           }
        }
            System.out.println("max num is : "+max);
        }
    }
