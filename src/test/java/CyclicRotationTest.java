import static org.junit.Assert.*;

/**
 * Created by jung on 2018/09/14.
 */
public class CyclicRotationTest {
    @org.junit.Test
    public void solution() throws Exception {
        int[] test = {1,2,3};
        int [] result = (new CyclicRotation()).solution(test,2);
        System.out.print(result.toString());
    }

    @org.junit.Test
    public void rotate() throws Exception {
    }

}