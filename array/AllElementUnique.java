public class AllElementUnique {
    // check the all element unquley find 

    
    public static boolean unique(int[] arr) {
        boolean[] vis = new boolean[1000];
        for (int i = 0; i < arr.length; i++) {
            if (vis[arr[i]]) {
                return false;
            }
            vis[arr[i]] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 34, 5, 33 };
        int[] arr2 = { 98, 76, 44, 33, 33, 2 };
        System.out.println(unique(arr1));
        System.out.println(unique(arr2));
    }
}
