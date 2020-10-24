package classes;

public class Point_5 {
    public static int func(int num){
            if(num <= 0) return num;
            return num % 10 + func(num / 10);
            /*Получаем последнюю цифру и
            сокращаем её к след-му вызову на младший разряд
             */
        }
}
