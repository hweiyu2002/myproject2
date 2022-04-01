package hweiyu.com.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String id, int amount){
        super(id, amount);
        off = 0.1f;

    }
}
