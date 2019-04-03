package mockitoExamples.example3;

import org.mockito.ArgumentMatcher;

import java.util.List;

import static org.mockito.Mockito.*;

public class MiddleMock {

    public static void main(String[] args) {
        List<String> list = mock(List.class);

        when(list.get(anyInt())).thenReturn("0");
        when(list.get(eq(5))).thenReturn("A");

        ArgumentMatcher<Integer> matcher = new ArgumentMatcher<Integer>() {
            @Override
            public boolean matches(Object argument) {
                return ((Integer) argument) % 3 == 0;
            }
        };

        when(list.get(intThat(matcher))).thenReturn("every Third");
        when(list.get(eq(9))).thenThrow(new RuntimeException("BOOOOO!"));
        when(list.get(eq(9))).thenThrow(new RuntimeException("fooooo!"));
        when(list.get(eq(9))).thenThrow(new RuntimeException("Kooooo!"));

        for (int i = 0; i < 10; i++) {
            System.err.println("list.get(" + i + ") = " + list.get(i));
        }
    }
}
