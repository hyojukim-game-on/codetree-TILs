import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;
        
        // 입력
        n = sc.nextInt();
        
        // 출력
        for (int i = n; i <= 100; i++) {
            if (i >= 90) {
                System.out.print("A ");
            } else if (i >= 80) {
                System.out.print("B ");
            } else if (i >= 70) {
                System.out.print("C ");
            } else if (i >= 60) {
                System.out.print("D ");
            } else {
                System.out.print("F ");
            }
        }
    
    }
}