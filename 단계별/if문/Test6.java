import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 방법1
        // int h = sc.nextInt();
        // int m = sc.nextInt();
        // int cookTime = sc.nextInt();

        // h += (m + cookTime) / 60;
        // h %= 24;
        // m = (m + cookTime) % 60;
        // System.out.println(h + " " + m);

        // 숏코딩
        int h = sc.nextInt(), m = sc.nextInt() + sc.nextInt();
        System.out.println((h + m / 60) % 24 + " " + m % 60);
    }
}
