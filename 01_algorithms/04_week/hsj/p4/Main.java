import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;

//        각각 1리터씩 들어있는 N개의 물병을 옮긴다
//
//        같은 양이 들어있는 물병끼리만 합칠 수 있다. ( 2 2 4 3 ) → 2 와 2 만 합칠 수 있음
//
//        N을 이진수로 나타내면 이미 최대한 합친 상태를 만들 수 있다 1 1 0 1 0 1 (32 16 4 1) 이 상태는 총 4개의 물병을 만들었다
//
//        K가 2라면 1의 개수가 2보다 작거나 같은 상태까지 1을 더한다.

        int cur = n;
        while (Integer.bitCount(cur)>k){
            ans++;
            cur++;
        }

        System.out.println(ans);
    }
}