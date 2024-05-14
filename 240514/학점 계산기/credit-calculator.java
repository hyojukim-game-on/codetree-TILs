import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }
        double sumValue = 0;
        int cntValue = 0;
        for (int i=0; i<n; i++) {
            sumValue += arr[i];
            cntValue += 1;
        }
        double avgValue = sumValue / (double) cntValue;
        System.out.printf("%.1f", avgValue);
        System.out.println();
        if (avgValue >= 4.0) {
            System.out.println("Perfect");
        } else if (avgValue >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}