import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result = getResult();

    @BeforeAll
    static void beforeAll() {
        System.out.println("###  BeforeAll()\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###    BeforeEach()");
       result = 0;
    }
    @AfterEach
    void afterEach() {
        System.out.println("###   afterEach()\n");
        result = getResult();
    }
    @AfterAll
    static void AfterAll() {
        System.out.println("###   afterAll()\n");

    }


    @Test
    void firstTest(){
        System.out.println("###    firstTest()");
        Assertions.assertTrue(result > 2);
    }



    @Test
    void secondTest(){
        System.out.println("###    secondTest()");
        Assertions.assertTrue(result > 2);
    }
    @Test
    void thirdTest(){
        System.out.println("###    thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult(){
        return 3;
    }

}
