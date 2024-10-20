package shoppingapp2; 
import java.util.Map; 
import java.util.Set;

public class Order {
Double geTotalBillAmount(Map<String,Double>ItemsOrdered)
{
Set<String>keys=ItemsOrdered.keySet(); double total=0;
for(String key:keys) total+=ItemsOrdered.get(key);
return total;

}

}
