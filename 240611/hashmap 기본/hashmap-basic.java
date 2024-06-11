import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        // hashmap 선언
        HashMap <Integer, Integer> myHashMap = new HashMap<>();

        // 여러 줄, 공백으로 나눠진 입력 받기
        for (int i=0; i<n; i++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            String operation = parts[0];

            // 명령어 별 동작 처리
            if (operation.equals("add")) {
                int key = Integer.parseInt(parts[1]);
                int value = Integer.parseInt(parts[2]);
                myHashMap.put(key, value);
            } else if (operation.equals("remove")) {
                int key = Integer.parseInt(parts[1]);
                myHashMap.remove(key);
            } else if (operation.equals("find")) {
                int key = Integer.parseInt(parts[1]);
                if (myHashMap.containsKey(key)) {
                    System.out.println(myHashMap.get(key));
                } else {
                    System.out.println("None");
                }
            }
        }

        sc.close();
        
    }
}