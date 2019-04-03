package example8;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ExceptionTest {

    private BookDAO dao;

    //option 1 expected exception
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMethod() throws Exception {
        throw new NullPointerException("exception");
    }


    //option 2 : try/catch idioms
    @Test
    public void showCaseTheExceptionTestingUsingTryCatchIdiom() {
        try {
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e.getMessage(), CoreMatchers.containsString("ArrayIndexOutOfBoundsException"));
        }
    }

    //option 3: ExpectedException rulle idiome

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void showCaseExpectedExceptionRule() {
        //set expectation
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage(containsString("ArrayIndexOutOfBoundsException"));
        //set expectation 2
        //actual test
    }

    @Before
    public void setUp() {
        this.dao = new BookDAO();
    }

    @After
    public void tearDown() {
        this.dao = null;
    }
}
