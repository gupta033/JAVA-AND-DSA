class frequncy {

    // it is check the frquncy in a array
    
    public static void getFrequncy(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n - 1];
                    n--;
                    j--;

                }
            }
            System.out.println(a[i] + " => " + count + " Times");
        }
    }

    public static void main(String[] args) {
        System.out.println("Frequncy of all elements:");
        //int[] a = { 12, 14, 15, 16, 18, 19, 12, 14 };
        int[] a= {-1,-1,-1,-1};
        getFrequncy(a);
    }

}