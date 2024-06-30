public class bshortDesand {
    public static int[] sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int x = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    x = 1;
                }
            }
            if (x == 0) {
                break;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 19, 33, 35, 77, 12 };
        int[] arr = sort(a);
        for (int p : arr) {
            System.out.print(p + "  ");
        }
    }
}
