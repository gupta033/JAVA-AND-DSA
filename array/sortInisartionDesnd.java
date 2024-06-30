public class sortInisartionDesnd {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            int key = a[j];
            while (j >=0 && a[j] < key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 12, 233, 14, 23, 43, 33 };
        sort(a);
        int[] arr = sort(a);
        for (int p : arr) {
            System.out.print(p + " ");
        }

    }
}
