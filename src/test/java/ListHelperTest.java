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
    public void testDistinctAndSortedElements(){
        Set<Integer> sortedCollection = ListHelper.getDistinctAndSortedElements(list);
        Assertions.assertEquals(Set.of(1, 2, 5, 10, 20), sortedCollection);
    }

    @Test
    public void testMaxElement(){
        int max = ListHelper.getMaxElement(new TreeSet<>(list));
        Assertions.assertEquals(20, max);
    }

    @Test
    public void testMinElement(){
        int min = ListHelper.getMinElement(new TreeSet<>(list));
        Assertions.assertEquals(1, min);
    }

    @Test
    public void testMaxElementWithEmptyList(){
        Assertions.assertThrows(NoSuchElementException.class, () -> ListHelper.getMaxElement(Collections.emptySet()));
    }

    @Test
    public void testMinElementWithEmptyList(){
        Assertions.assertThrows(NoSuchElementException.class, () -> ListHelper.getMinElement(Collections.emptySet()));
    }

}
