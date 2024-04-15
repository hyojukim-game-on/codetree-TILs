import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int a;
        int b;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        for ( int i = a; i <= b; ) {
            if ( i % 2 == 1 ) {
                System.out.print(i+" ");
                i *= 2;
            } else {
                System.out.print(i+" ");
                i += 3;
            }
        }
    }
}