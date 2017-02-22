package prepay.solutions;

import java.util.Comparator;
import java.util.HashMap;

public class PriceComparator implements Comparator<String> {

    private final HashMap<String, Double> prices;

    public PriceComparator(HashMap<String, Double> prices) {
        this.prices = prices;
    }

    @Override
    public int compare(String o1, String o2) {
        Double priceA = prices.get(o1);
        Double priceB = prices.get(o2);
        return (int)(priceA - priceB);
    }
}
