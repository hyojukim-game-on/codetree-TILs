import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sumValue = (double) a + (double) b ;
        double diffValue = (double) a - (double) b ;
        System.out.printf("%.2f", sumValue / diffValue);
    }
}