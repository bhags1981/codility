/**
 * Created by jung on 2018/09/14.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if(A.length  < 2 )
            return A;
        // write your code in Java SE 8
        for(int i = 0 ; i < K ; i ++){
            A = this.rotate(A);
        }
        return A;
    }


    public int[] rotate(int[] A){
        int[] rotatedArray = new int[A.length];
        for(int i = 1 ; i < A.length ; i ++){
            rotatedArray[i] = A[i-1];
        }
        rotatedArray[0] = A[A.length - 1];
        return rotatedArray;
    }
}
