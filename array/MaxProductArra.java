public class MaxProductArra {
    public static int maxProducts(int[] arr) {
        int maxProducts = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int pro = arr[i] * arr[j];
                if (pro < maxProducts) {
                    maxProducts = pro;
                }
            }
        }
        return maxProducts;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 9, 1, 5 };
        int result = maxProducts(arr);
        System.out.print("maximum product of two products in the arrray" + result);

    }
}
