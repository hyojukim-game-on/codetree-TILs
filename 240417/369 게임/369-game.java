import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 입력
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        // int n, i;

        // 변수 할당
        int n = sc.nextInt();
        
        // 출력
        for (int i = 1; i <=n; i++) {
            String iStr = String.valueOf(i);
            if ( i % 3 == 0 
            || iStr.contains("3") || iStr.contains("6") || iStr.contains("9")) {
                System.out.print("0 ");
            } else {
                System.out.print( i + " ");
            }
        }
    }
}