public class sortInertion {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 20, 25, 10, 22, 28, 24 };
        sort(a);
        int[] arr = sort(a);
        for (int p : arr) {
            System.out.print(p + " ");
        }

    }
}
