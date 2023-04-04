import java.util.*;
public class ReversanArry {
    public static void reversanarray(int number[] ){
        int first=0;
        int last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first ++;
            last --;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        reversanarray(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }
        System.out.println();
        
    }
}
