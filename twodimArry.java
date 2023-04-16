import java.util.Scanner;

import java.util.*;
class twodimArry{
    int a[][]=new int[3][3];
    void getdata(){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter number");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void putdata (){
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(a[i][j]+"---");
            }
            System.out.println();
        }
    }

}
class call{
    public static void main(String[] args) {
        twodimArry aa= new twodimArry();
        aa.getdata();
        aa.putdata();
    }
}