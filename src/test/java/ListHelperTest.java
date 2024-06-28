import org.example.ListHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public void testDistinctElements(){
        Set<Integer> distinctElements = ListHelper.getDistinctElements(list);
        Assert.assertEquals(list.size() - 1, distinctElements.size());
    }

    @Test
    public void testSortedElements(){
        Set<Integer> distinctElements = ListHelper.getDistinctElements(list);
        List<Integer> sortedList = ListHelper.sortElements(new ArrayList<>(distinctElements));
        Assert.assertEquals(1, sortedList.get(0).intValue());
        Assert.assertEquals(2, sortedList.get(1).intValue());
        Assert.assertEquals(5, sortedList.get(2).intValue());
        Assert.assertEquals(10, sortedList.get(3).intValue());
        Assert.assertEquals(20, sortedList.get(4).intValue());

    }

    @Test
    public void testMaxElement(){
        int max = ListHelper.getMaxElement(list);
        Assert.assertEquals(20, max);
    }

    @Test
    public void testMinElement(){
        int min = ListHelper.getMinElement(list);
        Assert.assertEquals(1, min);
    }

}
