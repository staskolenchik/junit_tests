package mockitoExamples.example1;

import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;


public class SimpleMock {

    public static void main(String[] args) {

        List<String> list = mock(List.class);

        //System.out.println(Mockito.anyInt());

        /*when(list.get(eq(5))).thenReturn("A");
        when(list.get(eq(6))).thenReturn("И");*/
        //when(list.get(eq(3))).thenReturn("B");

        Mockito.when(list.size()).thenReturn(Integer.MAX_VALUE); //1 init
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("Hello!");//2 init


        List<String> list1000 = Collections.nCopies(1000,"hello");// 3 init
        System.out.println(list1000); // 3 out

        System.out.println(list.size());//1 out

        for (int k = 0; k < 10; k++) {
            System.out.println("list.get(" + k + "): " + list.get(k));//2 out
        }

        /*System.out.println(list.add("A"));
        System.out.println(list.get(-1));
        System.out.println(list.size());
        System.out.println(list.iterator());

        System.out.println(list.getClass().getName());*/
    }
}
