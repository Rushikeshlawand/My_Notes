import java.util.Arrays;

public class train {
    int countPlatform(int[] incoming, int[] outgoing) {
        Arrays.sort(incoming);
        Arrays.sort(outgoing);

        int platform_needed = 1;
        int max_platforms = 1;
        int i = 1;
        int j = 0;

        while (i < incoming.length && j < outgoing.length) {
            if (incoming[i] <= outgoing[j]) {
                platform_needed++;
                i++;
            }

            else if (incoming[i] > outgoing[j]) {
                platform_needed--;
                j++;
            }

            if (platform_needed > max_platforms) {
                max_platforms = platform_needed;
            }
        }
        System.out.println(max_platforms);
        return max_platforms;
    }
    public static void main(String[] args) {
        train obj = new train();
        int incoming[] = { 10, 12, 15, 20, 30 };
        int outgoing[] = { 15, 18, 20, 25, 35 };
        obj.countPlatform(incoming, outgoing);
    }
}



// package greedyAlgo;

// import java.util.Arrays;
// // Minimum Number of Platforms Required
// public class Ex5 {
//     public static int findMinimumPlatforms(int[] arrivals, int[] departures) {
//         Arrays.sort(arrivals);
//         Arrays.sort(departures);

//         int platformsNeeded = 1;
//         int maxPlatforms = 1;

//         int i = 1, j = 0;
//         int n = arrivals.length;
//         while (i < n && j < n) {
//             if (arrivals[i] <= departures[j]) {
//                 platformsNeeded++;
//                 i++;
//             } else {
//                 platformsNeeded--;
//                 j++;
//             }
//             maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
//         }

//         return maxPlatforms;
//     }

//     public static void main(String[] args) {
//         int arv[] = {10, 12, 15, 20, 30}; // Arrival times
//         int dep[] = {11, 14, 17, 25, 40}; // Departure times

//         int result = findMinimumPlatforms(arv, dep);
//         System.out.println("Minimum Number of Platforms Required: " + result);
//     }
// }