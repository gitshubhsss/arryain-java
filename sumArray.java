public class sumArray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int prefixSum[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                sum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
            }
            System.out.print(sum + " ");
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println();

        System.out.println(max);

    }
}