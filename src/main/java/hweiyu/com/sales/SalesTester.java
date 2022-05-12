package hweiyu.com.sales;

//一般客戶 - 滿千送百
//銀級客戶 - 滿千送百,再送百元還禮金
//金級客戶 - 滿千送兩百,再送兩百還禮金
//added after:
//customer get 10% off discount
//customer get 30% off and 20% point
//0001 1200 1100
//0002 800 800
//0003 2000 1800(200)銀級客戶

//父類別的參照可以放 子類別所產生的物件

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002", 800));
        customers.add(new SilverCustomer("0003", 2000));
        customers.add(new GoldenCustomer("0004", 5000));
        customers.add(new DiscountCustomer("0005", 900));

        for (int i = 0; i < 5; i++) {
  //          customers.get(i).print();
        }
        for (Customer c: customers){
            c.print();
        }

        /*Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",1234);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldenCustomer c4 = new GoldenCustomer("0004",1000);
        DiscountCustomer c5 = new DiscountCustomer("0005",900);*/

        /*
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        */
    }
}
