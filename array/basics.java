public class basics {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 33;
        a[2] = 24;
        a[3] = 30;
        a[1] = 50;
        // System.out.println(a[2]);

        // input using for loops

        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]+ " ");
        // }

        // for each loops

        for (int p : a) {
            // System.out.print(p+" ");
        }

        int[] arr = { 12, 13, 14, 145, 145 };
        System.out.println(arr[3]);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
