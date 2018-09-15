import java.util.HashMap;
import java.util.Map;

/**
 * Created by jung on 2018/09/14.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        int[] checkList = new int[A.length+1];
        for (int i = 0 ; i < A.length; i ++){
            checkList[A[i]] = 1;
        }
        for (int i = 0; i < checkList.length; i++){
            if(checkList[i] == 0)
                return i+1;
        }
        return 0;
    }
}
