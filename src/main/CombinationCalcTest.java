import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// 組み合わせの数を計算するプログラム

public class CombinationCalcTest {

    @Test
    public void 引数の二つめが一つ目より大きいならマイナス１が返る(){
        var expected = -1;
        var result = CombinationCalc.CombinationCalcTest(3,4);
        assertEquals(expected, result);
    }

    @Test
    public void 引数の一つ以上がゼロかマイナスならマイナス１が返る(){
        var expected = -1;
        var result = CombinationCalc.CombinationCalcTest(0,0);
        assertEquals(expected, result);
    }
    @Test
    public void 組み合わせの計算(){
        var expected = 10;
        var result = CombinationCalc.CombinationCalcTest(5,3);
        assertEquals(expected, result);
    }





}
