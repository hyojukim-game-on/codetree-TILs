import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double[][] arr2d = new double[2][4];
       // 배열 저장
       for (int i=0; i<2; i++) {
            for (int j=0; j<4; j++) {
                arr2d[i][j] = sc.nextDouble();
            }
       }
       // 가로 순회
       for (int r=0; r<2; r++) {
            double sumRow = 0;
            for (int c=0; c<4; c++) {
                sumRow += arr2d[r][c];
            }
            System.out.printf("%.1f", sumRow/4);
            System.out.print(" ");    
       }
       System.out.println("");
       // 세로 순회
       for (int c=0; c<4; c++) {
            double sumCol = 0;
            for (int r=0; r<2; r++) {
                sumCol += arr2d[r][c];
            }
            System.out.printf("%.1f", sumCol/2);
            System.out.print(" ");
       }
       System.out.println("");
       // 전체 순회
       double sumAll = 0;
       for (int r=0; r<2; r++) {
            for (int c=0; c<4; c++) {
                sumAll += arr2d[r][c];
            }
       }     
       System.out.printf("%.1f", sumAll/8); 
    }
}