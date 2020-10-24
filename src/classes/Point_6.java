package classes;

public class Point_6 {
    public static void func(int num,int constant) {
        //в данном случае 2 = constant входящее ы
        if (num > 1) {
            if (num % constant != 0) {
                constant++;
                func(num, constant);
            }
            else if (num % constant == 0) {
                if (constant == num) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
