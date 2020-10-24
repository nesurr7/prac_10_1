package classes;

public class Point_4 {
    public static void func() {
        int countOfDigits = 3;
        int sumOfDigits = 2;
        int sum = 0;
        int tmp;
        int count = 0;
        int lowDigit = (int) Math.pow(10, countOfDigits - 1);
        int highDigit = (int) Math.pow(10, countOfDigits);
        for (int i = lowDigit; i < highDigit; i++) {
            tmp = i;
            while (tmp > 0) {
                sum += (tmp % 10);//суммируем цифру
                tmp /= 10;//избавляемся от младшего
            }
            if (sum == sumOfDigits) count++;
            sum = 0;
        }
        System.out.print(count);
    }
}
