import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(), i = 1; i <= n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}