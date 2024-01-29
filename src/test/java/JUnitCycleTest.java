import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    //전체 테스트 시작하기 전 딱 한번만 실행
    //데이터베이스 연결 혹은 테스트환경 초기화할 때 사용
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    //테스트 케이스 시작 전 항상 실행
    //테스트 메서드에 사용하는 객체 초기화 혹은 테스트 값을 미리 넣을 때 사용
    //각 인스턴스에 대해 메서드를 호출해야 하므로 메서드는 static이 아니어야 한다
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    //종료전 한 번만 실행
    //데이터베이스 연결 종료 때나 공통적으로 사용하는 자원 해제 시 사용.
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }


}
