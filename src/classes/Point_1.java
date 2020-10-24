package classes;

public class Point_1 {
    public static String func(int num) {
        int sum = 0;
        int j = 0;
        if (num == 1) {//Частный случай
            System.out.print("1");
        }
        else {
            for (int i = 1; sum < num; i++) {
                sum += i;//1//3//6
                j = i;//1//2//3
            }

            System.out.print(func(--num) + " " + j);
        }
        return "";
    }
}
