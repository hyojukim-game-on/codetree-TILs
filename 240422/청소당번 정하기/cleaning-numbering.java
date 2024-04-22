import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 2 교실 3 복도 12 화장실
        // 겹치면 주기 긴 거 하기
        // n 일간 진행 시 청소 횟수 출력
        // 0 일에는 진행 안함
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cntRoom = 0;
        int cntHallway = 0;
        int cntBath = 0;
        for (int i = 1; i <= N; i++) {
            if ( i % 12 == 0 ) {
                cntBath += 1;
            } else if ( i % 3 == 0 ) {
                cntHallway += 1;
            } else if ( i % 2 == 0 ) {
                cntRoom += 1;
            }
        }
        System.out.print(cntRoom+" "+cntHallway+" "+cntBath);
    }
}