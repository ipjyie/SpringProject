import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2는 3이다")
    @Test
    public void JunitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a+b, sum);
        //a+b의 값과 sum의 값이 같은지 확인
    }
}
