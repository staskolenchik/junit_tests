package example7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BookDAOTest {

     final List<String> library //
             = new ArrayList<String>(Arrays.asList("Effective Java", "2", "3", "4", "5", "6", "7", "8", "9", "10"));



    @Test
    public void testMethod() {
         assertTrue(library.size() == 10);
         assertEquals(10 , library.size());

         //readable expressive assertion tests
         assertThat(library.size(), is(equalTo(10)));

         //non expressive test
         assertNotSame(new Object(), new Object());
         //expressive test
         assertThat(new Object(), not(sameInstance(new Object())));

         //expressive test are more detailed and provide a ful coverage of class
        //for example I can test that one of the elem of string containes substring
         assertThat("Effective Java", containsString("Java"));
         assertThat("Effective Java", both(containsString("Java"))
                 .and(containsString("Effective")));
         assertThat("Effective Java", allOf(containsString("Effective"),
                 containsString("Java")));

         assertThat(library, hasItem("Effective Java"));

         assertTrue(library.stream().anyMatch(t -> t.equals("Effective Java")));
    }
}
