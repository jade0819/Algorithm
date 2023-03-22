import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Case #" + i + ": " + (sc.nextInt() + sc.nextInt()));
        }
        sc.close();
    }
}

/*********************************************************/

// import java.io.*;
// import java.util.StringTokenizer;

// public class Test7 {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// int n = Integer.parseInt(br.readLine());
// StringTokenizer st;

// for (int i = 1; i <= n; i++) {
// st = new StringTokenizer(br.readLine());
// bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) +
// Integer.parseInt(st.nextToken()))
// + "\n");
// }
// bw.flush();
// bw.close();
// }
// }
