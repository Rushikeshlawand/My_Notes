import java.util.*;
public class findAllJobss {

    static boolean canFinishJobs(int[] job, int k, int maxTime) {
        int currentAssigneeTime = 0;
        int assigneesNeeded = 1; 

        for (int j : job) {
            if (currentAssigneeTime + j <= maxTime) {
                currentAssigneeTime += j;
            } else {
                assigneesNeeded++;
                currentAssigneeTime = j;

                if (assigneesNeeded > k) {
                    return false;
                }
            }
        }

        return true;
    }

    static int findMinimumTime(int[] job, int k, int T) {
        int low = Arrays.stream(job).max().getAsInt();
        int high = Arrays.stream(job).sum();

        while (low < high) {
            int mid = (low + high) / 2;

            if (canFinishJobs(job, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low * T;
    }

    public static void main(String[] args) {
        int k1 = 2, T1 = 5;
        int[] job1 = { 4, 5, 10 };
        System.out.println(findMinimumTime(job1, k1, T1)); // Output: 50

        int k2 = 4, T2 = 5;
        int[] job2 = { 10, 7, 8, 12, 6, 8 };
        System.out.println(findMinimumTime(job2, k2, T2)); // Output: 75
    }
}
