import java.util.*;

class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];
        int[] rt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter AT and BT for P" + (i + 1) + ":");

            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();

            rt[i] = bt[i];
        }

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        boolean[] added = new boolean[n];

        int completed = 0;
        int time = 0;

        while (completed < n) {

            // Add newly arrived processes
            for (int i = 0; i < n; i++) {
                if (at[i] <= time && !added[i]) {
                    queue.add(i);
                    added[i] = true;
                }
            }

            if (queue.isEmpty()) {
                time++;
                continue;
            }

            int index = queue.poll();

            int executionTime = Math.min(tq, rt[index]);

            rt[index] -= executionTime;
            time += executionTime;

            // Add processes that arrived during execution
            for (int i = 0; i < n; i++) {
                if (at[i] <= time && !added[i]) {
                    queue.add(i);
                    added[i] = true;
                }
            }

            if (rt[index] > 0) {
                queue.add(index);
            } else {
                completed++;

                ct[index] = time;
                tat[index] = ct[index] - at[index];
                wt[index] = tat[index] - bt[index];
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
