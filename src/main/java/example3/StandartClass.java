package example3;

import org.junit.jupiter.api.*;

public class StandartClass {

    @BeforeAll
    static void initAll() {}

    @BeforeEach
    void init() {

    }

    @Test
    void succedingTest() {

    }

    /*@Test
    void failingTest() {
        fail("a failing test");
    }*/

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        //not execured
    }

    /*@Disabled
    @Test
    void abortedTest() {
        assumeTrue("abc".equals("Z"));
        fail("test should have been aborted");
    }*/

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void tearDownAll(){}

}
