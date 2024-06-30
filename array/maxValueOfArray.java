public class maxValueOfArray {

    // maximum element of array is deffind
    public static void main(String[] args) {
        int[] arr = { 2, 13, 5,55, 7, 33 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("max value is: " + ans);
    }
}
