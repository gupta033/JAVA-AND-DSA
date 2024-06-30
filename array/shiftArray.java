public class shiftArray {
    public static int[] getShiftall(int[] a) {
        int[] a2 = new int[a.length];
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count1++;
            }
            for (int j = a2.length - 1; count1 > 0; j--) {
                a2[j] = 1;
                count1--;
            }
        }
        return a2;
    }

    public static void main(String[] args) {
        int[] a2 = { 0, 0, 0, 0, 1, 1, 1 };
        int[] arr = getShiftall(a2); // Corrected the method invocation
        // Print the shifted array
        for (int p : arr) {
            System.out.print(p + " ");
        }
    }
}
