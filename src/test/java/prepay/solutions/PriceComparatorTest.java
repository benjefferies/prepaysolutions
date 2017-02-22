package prepay.solutions;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class PriceComparatorTest extends TestCase {

    public void testName1() throws Exception {
        HashMap<String, Double> map = new HashMap<>();
        map.put("test", null);
        map.put("test1", null);
        PriceComparator priceComparator = new PriceComparator(map);
        priceComparator.compare("test", "test1");

    }
}