package classes;

public class Point_3 {
    public static void func(int A , int B)
    {
        if(A<B) {
            Point_2.func(A, B);
        }
        else {
            while(B<=A){
                System.out.print(B+" ");
                B++;
            }
        }
    }
}
