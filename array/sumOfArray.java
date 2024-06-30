public class sumOfArray {

    // it is all elements add in array 
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = { 2, 3, 5, 10 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
