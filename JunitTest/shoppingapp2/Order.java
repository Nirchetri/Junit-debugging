package shoppingapp2;

import java.util.Map;
import java.util.Set;

public class Order {

    // Renamed from 'geTotalBillAmount' to 'getTotalBillAmount'
    public Double getTotalBillAmount(Map<String, Double> ItemsOrdered) {
        Set<String> keys = ItemsOrdered.keySet();
        double total = 0;

        for (String key : keys) {
            total += ItemsOrdered.get(key);  // Summing the values of the map (item prices)
        }

        return total;
    }
}
