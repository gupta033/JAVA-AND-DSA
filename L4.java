import java.util.*;
public class L4 {
    public static void main(String[] args) {

        // solid rectangal
        // for(int i=0; i<=4; i++){
        //     for(int j=0; j<=4; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // hplo ractangal
        // for(int i=1; i<=4; i++){
        //     for (int j=1; j<=5; j++){
        //         if(i==1 || j==1 || i==5 || j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
               
        //     }
        //     System.out.println();
        // }

        // half pyramid

        // for(int i=0; i<6; i++){
        //     for (int j=0; j<i; j++){
        //                 System.out.print("*");
        //     }
        //     System.out.println();

            
        // }

        // for(int i=4; i>=1; i--){
        //     for( int j=1; j<=i; j++){
        //         System.out.print("*");
        // }
        // System.out.println();
        // }
            //   invert half payramid 
            //      int n=4;  
            //    for (int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //    }
            //    for (int j=1; j<=i; j++){
            //     System.out.print("*");
            //    }
            //    System.out.println();
            // }
              
            // for(int i=0; i<=4; i++){
            //     for (int j=0; j<=i; j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

            // invert half parameter
            // for(int i=0; i<=5; i++){
            //     for (int j=0; j<=5-i+1; j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

            //floyd triangal
            int n=5;
            int number=1;
            for(int i=1; i<=n; i++){
                for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;

             }
            System.out.println();
            }

      }   }