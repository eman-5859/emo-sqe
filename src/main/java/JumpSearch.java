package searchlibrary;

public class JumpSearch {

    public static int search(int[] arr, int key) {

        int n = arr.length;

        int step = (int) Math.sqrt(n);

        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {

            prev = step;

            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;

        }

        for (int i = prev; i < Math.min(step, n); i++) {

            if (arr[i] == key)
                return i;

        }

        return -1;
    }
}