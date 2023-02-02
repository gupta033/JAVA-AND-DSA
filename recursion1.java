public class recursion1{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int total=sum(n-1);
        return total+n;

    }
        public static void main(String[] args) {
        System.out.println(sum(5));
    }
}