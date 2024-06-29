import org.example.ListHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.*;

public class ListHelperTest {
    List<Integer> list = new ArrayList<>();

    @Before
    public void addElements(){
        //1 10 20 20 2 5
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(20));
        list.add(Integer.valueOf(20));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(5));
    }

    @Test
    public void testDistinctElements() {
        Set<Integer> distinctElements = ListHelper.getDistinctElements(list);
        Assertions.assertEquals(5, distinctElements.size());

    }

    @Test
    public void testSortedElements(){
        Set<Integer> distinctElements = ListHelper.getDistinctElements(list);
        List<Integer> sortedList = ListHelper.sortElements(new ArrayList<>(distinctElements));
        Assertions.assertEquals(Arrays.asList(1, 2, 5, 10, 20), sortedList);

    }

    @Test
    public void testMaxElement(){
        int max = ListHelper.getMaxElement(list);
        Assertions.assertEquals(20, max);
    }

    @Test
    public void testMinElement(){
        int min = ListHelper.getMinElement(list);
        Assertions.assertEquals(1, min);
    }

    @Test
    public void testMaxElementWithEmptyList(){
        Assertions.assertThrows(NoSuchElementException.class, () -> ListHelper.getMaxElement(Collections.emptyList()));
    }

    @Test
    public void testMinElementWithEmptyList(){
        Assertions.assertThrows(NoSuchElementException.class, () -> ListHelper.getMinElement(Collections.emptyList()));
    }

}
