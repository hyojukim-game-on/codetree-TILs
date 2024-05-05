import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sumValue = 0;
        int cnt = 0;
        double avgValue = 0;
        int firstNum = sc.nextInt();
        arr[0] = firstNum;
        for (int i=1; i<10; i++) {
            int num = sc.nextInt();
            if ( num < 250 ) {
                arr[i] = num;
            } else {
                break;
            }
        }
        for (int j=0; j<10; j++) {
            // System.out.println("j:"+j);
            // System.out.println("sumValue:"+sumValue);
            // System.out.println("cnt:"+cnt);
            // System.out.println("arr[j]:"+arr[j]);
            if (arr[j] != 0) {
                sumValue += arr[j];
                cnt += 1;
            } else { 
                break; 
            };
        }
        avgValue += (sumValue / (double) cnt);
        System.out.printf("%d", sumValue);
        System.out.print(" ");
        System.out.printf("%.1f", avgValue);
    }
}