public class freqApper {
    public static void apperFrequncy(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n - 1];
                    n--;
                    j--;
                }
            }
            if (count == 1) {
                System.out.println(a[i] + " ");
            }
            // System.out.println();
        }
    }

    // check the appeard the only on in array
    public static void main(String[] args) {
        int[] a = { 12, 14, 13, 15, 16 };
        apperFrequncy(a);

    }
}
