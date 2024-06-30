public class elementSearchingLinear {
    public static int searchElem(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={12,18,20,26,30,33,38};
        // searchElem(a, target);
        int index = searchElem(a, 33);
    if(index>=0)
    {
        System.out.println("element is found : " + index);
    }else
    {
        System.out.println("element is not found");
    }
    }
}
