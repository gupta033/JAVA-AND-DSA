public class CheckTheSorting {
    static boolean sort(int[] arr) {
        boolean cek = true;
        for (int i = 1; i < arr.length; i++) { // start from index 1
            if (arr[i] < arr[i - 1]) {
                cek = false;
                break;
            }
        }
        return cek;
    }

    static int tripalSum(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 3 };
        // boolean isSorted = sort(arr); // store the result of sort method
        // if (isSorted) {
        // System.out.println("Array is sorted");
        // } else {
        // System.out.println("Array is not sorted");
        // }

        int p = tripalSum(arr, 10);

        System.out.println(p);

    }
}
