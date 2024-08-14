import java.util.Scanner;

public class Main {

    public static void printSquare(int n) {
        int cnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (cnt == 9) {
                    cnt = 1;
                    System.out.print(cnt);
                    System.out.print(" ");
                } else {
                   cnt += 1;
                   System.out.print(cnt);
                   System.out.print(" "); 
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n);
    }
}