package classes;

public class Point_7 {
    public static void func(int num, int constant){
        if (num % constant == 0 && constant != num) {
            System.out.print(constant + " ");
            func(num / constant, constant);
        }
        else{
            if(constant == num) System.out.println(constant);
            else{
                constant++;
                func(num, constant);
            }
        }
    }
}
