import java.util.*;

class SJFNonPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];
        boolean[] done = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter AT and BT for P" + (i + 1) + ":");
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
        }

        int completed = 0;
        int time = 0;

        while (completed < n) {
            int index = -1;
            int minBT = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!done[i] && at[i] <= time && bt[i] < minBT) {
                    minBT = bt[i];
                    index = i;
                }
            }

            if (index == -1) {
                time++;
            } else {
                time += bt[index];

                ct[index] = time;
                tat[index] = ct[index] - at[index];
                wt[index] = tat[index] - bt[index];

                done[index] = true;
                completed++;
            }
        }

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");

        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t" +
                    at[i] + "\t" +
                    bt[i] + "\t" +
                    ct[i] + "\t" +
                    tat[i] + "\t" +
                    wt[i]);
        }
    }
}