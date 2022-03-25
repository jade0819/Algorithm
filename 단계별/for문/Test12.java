import java.util.Scanner;

// public class Test12 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// for (;;) {
// int a = sc.nextInt();
// int b = sc.nextInt();
// if (a == 0 && b == 0)
// break;
// else
// System.out.println(a + b);
// }
// }
// }

public class Test12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int c; (c = s.nextInt() + s.nextInt()) > 0; System.out.println(c))
            ;
    }
}