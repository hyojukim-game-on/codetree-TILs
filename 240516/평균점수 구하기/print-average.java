import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[8];
        double sumValue = 0;
        for (int i=0; i<8; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i=0; i<8; i++) {
            sumValue += arr[i];
        }
        double avgValue = sumValue / (double) 8;
        System.out.printf("%.1f",avgValue);
    }
}