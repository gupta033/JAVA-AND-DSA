public class sortFirstHalfScandHalf {

    public static int[] sortfirScan(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int x = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    x = 1;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = { 12, 56, 76, 23, 13, 33 };
        int[] arr = sortfirScan(a);
        for (int i = 0; i < a.length / 2; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = a.length - 1; i >= a.length / 2; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
