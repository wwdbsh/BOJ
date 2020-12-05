import java.io.*; // 모험가 길드 311p 507p
import java.util.*;

public class Q01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] people = new int[n];
        for(int idx = 0; idx < n; idx++) people[idx] = Integer.parseInt(st.nextToken());

        Arrays.sort(people);

        int result = 0, count = 0;

        for(int idx = 0; idx < n; idx++){
            count++;
            if(count >= people[idx]){
                result++;
                count = 0;
            }
        }
        
        // for(int idx = 0; idx < n; idx++){
        //     int fear = people[idx];
        //     if(idx+fear >= n) break;
        //     idx += (fear - 1);
        //     result++;
        // }
        
        System.out.println(result);
        br.close();
    }
}