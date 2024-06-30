public class repetedElementInarray {
    public static void main(String[] args) {
        int[] arr = { 12, 22, 33, 45, 4, 33, 57, 89, 33 };
        int count = 0;
        int x = 33;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("repting values: "+count);
    }
}
