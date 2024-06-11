import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];

        // 입력받기
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            D[i] = sc.nextInt();
        }

        // 두 수열의 합을 저장할 맵
        Map<Integer, Integer> sumAB = new HashMap<>();

        // A와 B의 합을 맵에 저장
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                sumAB.put(sum, sumAB.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

        // C와 D의 합의 음수가 sumAB에 있는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = C[i] + D[j];
                if (sumAB.containsKey(-sum)) {
                    count += sumAB.get(-sum);
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}