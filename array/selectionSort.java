public class selectionSort {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    min_index = j;
                }
            }
            a[min_index] = a[i];
            a[i] = min;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 28, 5, 8, 33, 25, 5 };
        int[] arr = sort(a);
        for (int p : arr) {
            System.out.print(p + " ");
        }
    }
}
