import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    @Test
    void compareListTest() {

//        Declare two Lists
        final List<String> listA = Arrays.asList("Domey", "Mathias", "Abena", "Khoby", "Eben");
        final List<String> listB = Arrays.asList("Abena", "Domey", "Eben", "Khoby", "Mathias");

//        Sort the first list
        Collections.sort(listA);

//   Write a Test to compare if listA is equal to listB
        Assertions.assertEquals(listA, listB);
    }
}
