package jUnitTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.*;

class FailExampleTest {

    @Test
    public void test_size_after_add_one() {
        List<String> list = new ArrayList<>();
        list.add("A");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void test_size_add_two() {}

    @Test
    public void test_convert_A_to_B() {}


    @Test
    public void test_list_has_only_X_or_Y() {
        List<String> list = asList("A", "X", "Y");
        Assert.assertThat(list, anyOf(allOf(hasItem("X"), not("Y")), allOf(not(hasItem("X")), hasItem("Y"))));
    }
}