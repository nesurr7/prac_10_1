package classes;

public class Point_9 {
    public static int func(int a, int b){
        //b->1,a->0
        if(a > b + 1) return 0;//010100!
        if(a == 0 || b == 0) return 1;//a=1,b=0;a=0,b=+inf
        return func(a, b-1) + func(a-1, b-1);//1xxxx,01xxx
    }
}
