public class NonRepeatingElement {

    // non-repitable in sort array 

    public static int findFirstNonRepeatingIndex(int[] a) {
        int n = a.length;
        if (n == 1) {
            return 0;
        }
        for (int i = 1; i < n - 1; i++) {
            if (a[i] != a[i - 1] && a[i] != a[i + 1]) {
                return i;
            }
        }
        if (a[n - 1] != a[n - 2]) {
            return n - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
        int index = findFirstNonRepeatingIndex(a);
        if (index != -1) {
            System.out.println("First non-repeating element: " + a[index] + " At index " + index);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
