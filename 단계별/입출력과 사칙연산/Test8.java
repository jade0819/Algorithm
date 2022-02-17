import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextInt();
        System.out.print(a / b);
        // 상대 오차 10-9 이하만 정답.
    }
}