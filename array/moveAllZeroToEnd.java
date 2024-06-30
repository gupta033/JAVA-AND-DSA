public class moveAllZeroToEnd {

    // move the all zero in last postion in array

    public static void moveZero(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }

        }
        while (count < n) {
            arr[count++] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 3, 0, 33, 0 };
        moveZero(arr);
        System.out.println("Array after moving to the end");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
