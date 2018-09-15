/**
 * Created by jung on 2018/09/14.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {


        int leftTotal = A[0];
        int rightTotal = A[A.length-1];
        int leftPos = 1;
        int rightPos = 1;
        for(int i = 1 ; i < A.length - 1; i ++){
            //Compare between two diff
            //Increase right position
            int diff1 = Math.abs(leftTotal - (rightTotal + A[A.length - 1 - rightPos]));
            int diff2 = Math.abs((leftTotal + A[leftPos]) - rightTotal);

            if(diff1 > diff2){
                leftTotal = leftTotal + A[leftPos];
                leftPos++;
            }else{
                rightTotal = rightTotal + A[A.length - 1 - rightPos];
                rightPos++;
            }
        }
        return Math.abs(leftTotal- rightTotal);
    }
}
