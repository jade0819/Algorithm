import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
    }
}