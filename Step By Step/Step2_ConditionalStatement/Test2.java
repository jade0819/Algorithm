import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// public class Test2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int jumsu = sc.nextInt();
//         String hakjum = "A";

//         if (90 > jumsu) {
//             if (60 > jumsu)
//                 hakjum = "F";
//             else if (70 > jumsu)
//                 hakjum = "D";
//             else if (80 > jumsu)
//                 hakjum = "C";
//             else
//                 hakjum = "B";
//         }

//         System.out.println(hakjum);
//     }
// }

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        switch (n / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
        System.out.println();
    }
}