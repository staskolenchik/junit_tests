package example5;

import org.junit.*;

import static org.junit.Assert.fail;

public class BookDAOTest {

    @BeforeClass
    public static void initExpensiveResource() {
        System.out.println("BookDAOTest.init");
    }

    @AfterClass
    public static void destroyExpensiveResource() {
        System.out.println("BookDAOTest.destroy");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("BookDAOTest.setUp");
    }

    @After
    public void tearDown() {
        System.out.println("BookDAOTest.tearDown");
    }

    @Test
    public void aVerySimpleTest() {
        System.out.println("BookDAOTest.aVerySimpleTest");
    }

    @Test
    public void anotherVerySimpleTest() {
        System.out.println("BookDAOTest.anotherVerySimpleTest");
    }

    @Test
    public void whenAnExceptionIsThrownTearDownMethodIsInvoked() {
        fail("foo");

    }

    @Test
    public void whenAnATestAssertionFailsTearDownMethodIsInvoked() {
        throw new RuntimeException("foo");
    }
}
