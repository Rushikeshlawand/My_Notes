package HomeWork;

public class HWMaxLeader {
    public static void main(String[] args) {
    int[] arr = {16, 17, 4, 3, 5, 2};
    int[] ans = new int[arr.length];
    int count = 0;
    for (int i = 0; i < ans.length; i++) {
        boolean flag = true;
        for (int j = i + 1; j < ans.length; j++) {
            if (arr[i] > arr[j]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            ans[count] = arr[i];
            count++;
        }
    }
    for(int i = 0; i<ans.length;i++) {
        System.out.print(ans[i] + " ");
    }
}
}

//.Write a program to print all the Leaders in the array. An element is a Leader if it
//is greater than all the elements to its right side. And the rightmost element is
//always a leader.
//Examples:
//Input: arr[] = {16, 17, 4, 3, 5, 2}
//Output: 17 5 2
//Input: arr[] = {1, 2, 3, 4, 5, 2}
//Output: 5 2