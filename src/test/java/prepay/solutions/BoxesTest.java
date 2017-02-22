package prepay.solutions;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static prepay.solutions.Boxes.minimalNumberOfBoxes;

public class BoxesTest {

    @Test
    public void test1() throws Exception {
        assertEquals(4, minimalNumberOfBoxes(12, 3, 3));
    }


    @Test
    public void test2() throws Exception {
        assertEquals(3, minimalNumberOfBoxes(11, 3, 3));
    }


    @Test
    public void test3() throws Exception {
        assertEquals(-1, minimalNumberOfBoxes(11, 0, 0));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(-1, minimalNumberOfBoxes(11, 0, 0));
    }

    @Test
    public void test5() throws Exception {
        assertEquals(-1, minimalNumberOfBoxes(11, 3, 0));
    }

    @Test
    public void test6() throws Exception {
        assertEquals(3, minimalNumberOfBoxes(11, 2, 1));
    }
}