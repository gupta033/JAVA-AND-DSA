public class twoOfarray {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 33, 34, 27 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
