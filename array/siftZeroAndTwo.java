public class siftZeroAndTwo {
    public static int[] shift(int[] a) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count0++;
            } else if (a[i] == 1) {
                count1++;
            }
        }
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            if (i < count0 + count1) {
                b[i] = 1;
            } else {
                b[i] = 2;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int[] a = { 0, 2, 0, 1, 2, 1, 0, 2 };
        shift(a);
        int[] arr = shift(a); // Assign the result to a variable
        for (int p : arr) { // Print the shifted array
            System.out.print(p + " ");
        }
    }
}
