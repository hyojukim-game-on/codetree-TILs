import java.util.Scanner;

public class Main {

    public static void printLCM(int n, int m) {
        int tmp1 = 0;
        int tmp2 = 0;
        int result = 0xfffff;
        for (int i=1; i<m+1; i++) {
            tmp1 = n * i;
            for (int j=1; j<n+1; j++) {
                tmp2 = m * j;
                if (tmp1 == tmp2) {
                    if (result > tmp2) {
                        result = tmp2;
                        System.out.println(result);
                    }
            }}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printLCM(n,m);
    }
}