package Math;

public class q_17 {
    // Prints average of a stream of numbers
    public static void streamAvg(float[] arr) {
        int n = arr.length;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            avg = (avg * i + arr[i]) / (i + 1);
            System.out.printf("Average of %d numbers is %f \n", i + 1, avg);
        }
    }
    public static void streamAvg2(float[] arr) {
        int n = arr.length;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            avg = getAvg(avg, arr[i], i);
            System.out.printf("Average of %d numbers is %f \n", i + 1, avg);
        }
    }

    // Calculate the new average
    static float getAvg(float prev_avg, float x, int n) {
        return (prev_avg * n + x) / (n + 1);
    }

    public static void main(String[] args) {
        float[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        streamAvg(arr);
        System.out.println("=========================================================================");
        streamAvg2(arr);
    }
}
