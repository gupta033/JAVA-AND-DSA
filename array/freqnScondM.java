public class freqnScondM {
    public static void main(String[] args) {
        int[] arr = { 12, 22, 33, 445, 54 };
        int[] a = new int[1000];
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            a[arr[i]]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " is: " + a[i] + " times");
            }
        }

    }
}
