public class HalfInverParame {
    public static void Invailed_half_parameter(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Invailed_half_parameter(4);
        
    }
}
