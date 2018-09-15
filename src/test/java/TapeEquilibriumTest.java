import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jung on 2018/09/14.
 */
public class TapeEquilibriumTest {
    @Test
    public void solution() throws Exception {
        int[] test = {-1,1,-1,-1,1,1,1,-1,1,-1,1,-1,1,1,-1,-1};
        int reulst = (new TapeEquilibrium()).solution(test);
        System.out.print(reulst);
    }

}