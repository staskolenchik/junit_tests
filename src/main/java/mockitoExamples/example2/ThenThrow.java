package mockitoExamples.example2;

import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;

public class ThenThrow {

    public static void main(String[] args) {
        List<String> list = mock(List.class);
        Mockito.when(list.get(eq(9))).thenReturn(String.valueOf(new RuntimeException("Boooooo!")));

        for (int k = 0; k < 10; k++) {
            System.err.println("list.get(" + k + ") = " + list.get(k));
        }
    }
}
