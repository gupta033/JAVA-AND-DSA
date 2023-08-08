import java.util.Scanner;

public class L2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();
        // if(age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("NOT adult");
        // }
        // int x=sc.nextInt();
        // if(x%2==0){
        //     System.out.println("EVEN");
        // }
        // else{
        //     System.out.println("Odd");

        int a=sc.nextInt();
        int b=sc.nextInt();
       if(a==b){
        System.out.println("Equals");
       }
       else if(a>b){
        System.out.println("a is greater than b");
       }
       else {
        System.out.println("a is less than b");
       }
        
    }
}   

