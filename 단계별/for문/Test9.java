import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < (i + 1); j++)
                System.out.print(j == i ? "*\n" : "*");
    }
}