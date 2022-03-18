package hweiyu.com;

public class GoldenCustomer extends Customer{
    public  GoldenCustomer(String id, int amount) {
        super(id, amount);
        off = 0.2f;
    }
}
