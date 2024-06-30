public class maxArrayIndexNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 55,33, 67, 89, 33 };
        int x = 33;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println("found the : " + x + " is index:" + ans);
    }
}
