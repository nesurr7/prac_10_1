package classes;

public class Point_10 {
    public static int func(int num, int b){
        if(num == 0) return b;
        else{
            b = b * 10 + num % 10;
            num /= 10;
            return func(num, b);
        }
    }
}
