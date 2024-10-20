package shoppingapp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;

public class OrderTest {

    @Test
    public void testGetTotalBillAmount() {
        // Arrange: Creating the items map for the test
        Map<String, Double> itemsOrdered = new HashMap<>();
        itemsOrdered.put("Item1", 2.0);
        itemsOrdered.put("Item2", 4.0);
        
        // Create an instance of the Order class
        Order order = new Order();
        
        // Act: Get the total bill amount
        double actualTotal = order.getTotalBillAmount(itemsOrdered);
        
        // Assert: Check if the calculated total is equal to the expected total
        assertEquals(6.0, actualTotal, 0.001);  // 0.001 is the delta for floating-point comparison
    }
}
