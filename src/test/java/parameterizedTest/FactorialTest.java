package parameterizedTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


@RunWith(Parameterized.class)
public class FactorialTest {

    @Parameterized.Parameters(name = "{index} : factorial({0} = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0,1},{1,1},{2,2},{3,6},{4,24},{5,120}
        });
    }

    @Parameterized.Parameter(0)
    public int input;
    @Parameterized.Parameter(1)
    public int expected;




    /*public FactorialTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }*/

    @Test
    public void testFactorialFunctionUsingParameterizedTests() {
        Assert.assertThat(Factorial.compute(input), is(equalTo(expected)));
    }

    @Ignore
    @Test
    public void testFactorial() {
        Assert.assertThat(Factorial.compute(0), is(equalTo(1)));
        Assert.assertThat(Factorial.compute(1), is(equalTo(1)));
        Assert.assertThat(Factorial.compute(2), is(equalTo(2)));
        Assert.assertThat(Factorial.compute(3), is(equalTo(6)));
        Assert.assertThat(Factorial.compute(4), is(equalTo(24)));
        Assert.assertThat(Factorial.compute(5), is(equalTo(120)));
    }

}