import java.util.*;

public class leetCode2685 {
    static int V, D;

    public static int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] arr = new ArrayList[n];
        Arrays.setAll(arr, _ -> new ArrayList<>());
        for (int[] e : edges) {
            arr[e[0]].add(e[1]);
            arr[e[1]].add(e[0]);
        }

        boolean[] vis = new boolean[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean state = vis[i];

            if (!state) {
                V = 0;
                D = 0;

                dfs(i, arr, vis);
                if (D == V * (V - 1)) res++;
            }
        }

        return res;

    }

    private static void dfs(int x, List<Integer>[] arr, boolean[] vis) {
        V++;
        D += arr[x].size();
        vis[x] = true;

        for (int state : arr[x]) {
            if (!vis[state]) {
                dfs(state, arr, vis);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1},{0, 2},{1, 2},{3, 4}};
        int n = 6;
        System.out.println(countCompleteComponents(n, arr));

    }
}
