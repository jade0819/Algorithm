import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(m < 45 ? (h <= 0 ? h = 23 : h - 1) + " " + (60 - (45 - m)) : h + " " + (m - 45));

        // System.out.println(m < 45 ? (h <= 0 ? h = 23 : h - 1) + " " + (60 - 45 + m) :
        // h + " " + (m - 45));
    }
}