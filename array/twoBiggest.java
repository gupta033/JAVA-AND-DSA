public class twoBiggest {
    public static void getTwoBiggest(int[] a) {
        int h1 = a[0];

        int h2 = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > h1) {
                h2 = h1;
                h1 = a[i];
            } else if (a[i] > h2 && a[i] != h1) {
                h2 = a[i];
            }

        }
        System.out.println("Bigest Number is:" + h1);
        if (h2 == Integer.MIN_VALUE) {
            System.out.println("Bigeest number is Doesnot exist:" );
        } else
            System.out.println("Second Bigest Number is:" + h2);
    }

    public static void main(String[] args) {
        int[] a = { 12, 13, 14,16,39,2647,535 };
        getTwoBiggest(a);

    }
}
