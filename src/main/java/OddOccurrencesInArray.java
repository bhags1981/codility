import java.util.HashMap;
import java.util.Map;

/**
 * Created by jung on 2018/09/14.
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // Prepare check list
        Map<String,Integer> occurrences = new HashMap<String, Integer>();

        for(int i = 0 ; i < A.length; i ++){
            String key = String.valueOf(A[i]);
            if(occurrences.containsKey(key)) {
                int counter = occurrences.get(key) + 1;
                occurrences.put(key, counter);
            }else{
                occurrences.put(key, 1);
            }
        }

        for (String key : occurrences.keySet()){
            if(occurrences.get(key) % 2 == 1)
                return Integer.parseInt(key);
        }
        return 0;
    }
}
