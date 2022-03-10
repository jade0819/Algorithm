import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

        }
        bw.flush();
        bw.close();
    }
}

///////////////////////////////
// split()사용

// public class Test4 {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// int n = Integer.parseInt(br.readLine());

// for (int i = 0; i < n; i++) {
// String[] arr = br.readLine().split(" ");
// bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) + "\n");

// }
// bw.flush();
// bw.close();
// }
// }
