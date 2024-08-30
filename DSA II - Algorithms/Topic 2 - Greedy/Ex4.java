// Activity Selection Problem
// Question:
// Given a set of activities with their start and end times, determine the maximum number of activities that can be performed by a single person such that no two activities overlap.
// Test case 1
// // Activities with no overlap
// int[][] activities1 = { {1, 2}, {3, 4}, {5, 6}, {7, 8} };
// // Expected Output: 4 (All activities can be selected)

// Test case 2

// // Activities with some overlap
// int[][] activities2 = { {1, 4}, {2, 6}, {5, 7}, {8, 9} };
// // Expected Output: 3 (Select activities (1, 4), (5, 7), (8, 9))


// Test case 3

// // Activities with complete overlap
// int[][] activities3 = { {1, 2}, {2, 3}, {3, 4}, {1, 5} };
// // Expected Output: 3 (Select activities (1, 2), (2, 3), (3, 4))


import java.util.Arrays;
import java.util.Comparator;

// Activity Selection Problem
class Activity {
    int start;
    int end;

    // Corrected constructor
    Activity(int start, int end) {
        this.start = start;  // Assign the parameter start to the class field start
        this.end = end;      // Assign the parameter end to the class field end
    }
}

public class Ex4 {
    public static void activitySelection(Activity[] activities) {
        // Sort activities based on their end time
        Arrays.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity a1, Activity a2) {
                return Integer.compare(a1.end, a2.end);
            }
        });

        // Print the sorted activities based on their end time
        System.out.println(activities[0].start + " " + activities[0].end);
        Activity lastActivity = activities[0];
        for (int i = 1; i < activities.length; i++) {
            if(activities[i].start>=lastActivity.end)
            {
                System.out.println(activities[i].start + " " + activities[i].end);
                lastActivity.end = activities[i].start;
            }
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
                new Activity(3, 4),
                new Activity(1, 3),
                new Activity(2, 8),
                new Activity(5, 6)
        };
        activitySelection(activities);
    }
}