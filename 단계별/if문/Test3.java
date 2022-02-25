import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    /* 방법1 */
    // public static void main(String[] args) throws IOException {
    // BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    // int year = Integer.parseInt(rd.readLine());

    // if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    // System.out.println(1);
    // else
    // System.out.println(0);
    // }

    /* 방법2 */
    // Scanner에 close()를 하지 않을 때 뜨는 warning(경고) 무시하기
    // resource : 닫기 가능 유형의 자원 사용에 관련된 경고 억제
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int year = new java.util.Scanner(System.in).nextInt();

        System.out.println(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0);

    }
}
