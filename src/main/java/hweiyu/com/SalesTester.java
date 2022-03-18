package hweiyu.com;

//一般客戶 - 滿千送百
//銀級客戶 - 滿千送百,再送百元還禮金
//金級客戶 - 滿千送兩百,再送兩百還禮金
//0001 1200 1100
//0002 800 800
//0003 2000 1800(200)銀級客戶

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",1000);
        SilverCustomer c3 = new SilverCustomer("0003",1100);
        GoldenCustomer c4 = new GoldenCustomer("0004",1300);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
