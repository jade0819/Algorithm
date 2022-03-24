import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 메모리: 15292KB / 시간: 160ms
public class Test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < x)
                sb.append(value).append(" ");
        }
        System.out.println(sb);
    }
}

/************************************************ */
// import java.util.Scanner;

// // 메모리: 32100KB / 시간: 720ms
// public class Test11 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt(), x = sc.nextInt();
// for (int i = 0; i < n; i++) {
// int a = sc.nextInt();
// System.out.print(a < x ? a + " " : "");
// }
// }
// }
