import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        int a, b, i;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        i = a;

        // 출력
        while(i <= b) {
            System.out.print(i + " ");
            if (i % 2 == 1) {
                i *= 2;
            } else {
                i += 3;
            }
        }
    }
}