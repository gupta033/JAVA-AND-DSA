import java.util.*;
public class Rectangele {
    public static void main(String[] args) {
        int len,br,area,peri;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        len=sc.nextInt();
        System.out.println("enter beraths:");
        br=sc.nextInt();
        area=len*br;
        peri=2*(len+br);
        System.out.println("area of ractangel:"+area);
        System.out.println("perimetar of ractangel:"+peri);

    }

}
