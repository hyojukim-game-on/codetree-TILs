import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] arr2d = new int[4][4];
        for (int i=0; i<n; i++) {
            int sumRow = 0;
            for (int j=0; j<n; j++) {
                arr2d[i][j] = sc.nextInt();
                sumRow += arr2d[i][j];
            }
            System.out.println(sumRow);
        }
        
    }
}