package classes;

import java.util.Scanner;

public class Point_12 {
    public static void func(){
        Scanner in = new Scanner(System.in);
        int tmp = in.nextInt();
        while(tmp != 0){
            if(tmp % 2 != 0) {
                System.out.println(tmp);}
            tmp = in.nextInt();
        }

    }
}
