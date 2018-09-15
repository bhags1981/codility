/**
 * Created by jung on 2018/09/15.
 */
import java.util.*;

public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> passedCarsCount = new ArrayList<Integer>();
        int totalWestCars = 0;
        for(int i = 0 ; i < A.length ; i ++){
            if(A[i] == 0 ){
                passedCarsCount.add(totalWestCars);
            }else{
                totalWestCars +=1;
            }
        }
        long totalPairs = 0;
        for(int passedCount : passedCarsCount){
            totalPairs += (totalWestCars - passedCount);
        }
        if(totalPairs > 1000000000)
            return -1;
        return (int) totalPairs;
    }
}
