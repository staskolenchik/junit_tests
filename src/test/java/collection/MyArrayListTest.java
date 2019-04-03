package collection;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void test_size_after_add_one_element() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        if (new MyArrayList<String>().size() != 1) {
            throw new AssertionError();
        }
    }


    @Test
    public void test_empty_size() {
        if (new MyArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void test_empty_add_null() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add(null);
        if (new MyArrayList<String>().size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void test_add_remove_same_element() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.remove("A");
        if (new MyArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void test_add_remove_another_element() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.remove("B");
        if (new MyArrayList<String>().size() != 1) {
            throw new AssertionError();
        }
    }


}