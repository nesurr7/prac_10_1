package classes;
import java.util.Scanner;

public class Point_11 {
    public static void func(){
        Scanner in = new Scanner(System.in);
        int fir = in.nextInt();
        int sec = in.nextInt();
        int count = 0;
        while(fir != 0 || sec != 0){
            if(fir == 1) count++;
            fir = sec;
            sec = in.nextInt();
        }
        System.out.println(count);
    }
}
