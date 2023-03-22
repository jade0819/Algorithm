// import java.util.Scanner;

// public class Test10 {
//     public static void main(String[] args) {
//         for (int n = new Scanner(System.in).nextInt(), i = n; i >= 1; i--)
//             for (int j = 1; j <= n; j++)
//                 System.out.print(i <= j ? (j == n ? "*\n" : "*") : " ");
//     }
// }

/***************************************************** */
public class Test10 {
    public static void main(String[] args) {
        for (int n = new java.util.Scanner(System.in).nextInt(), i = 1; i <= n; i++)
            System.out.println(" ".repeat((n - i)) + "*".repeat(i));
    }
}