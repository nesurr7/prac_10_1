package classes;
import java.util.Arrays;

public class Point_8 {
    public static void func(String str){
        if(str.equals(new StringBuffer(str).reverse().toString()))
            System.out.print("1");
        else System.out.print("0");
    }
}
