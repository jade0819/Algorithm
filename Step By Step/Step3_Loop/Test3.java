import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 방법1
        // int n = new Scanner(System.in).nextInt();
        // int result = 0;
        // for (int i = 1; i <= n; i++) {
        // result += i;
        // }
        // System.out.println(result);

        // 방법2
        int n = new Scanner(System.in).nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}
