package hweiyu.com.sales;

public class Customer {
    String id ;
    int amount;
    float off = 0.1f;
    public Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public float backMoney(){
        return (amount/1000)*off*1000;
    }
    public void print(){
        float money = amount-backMoney();
        System.out.println(id+ "\t" + amount +"\t"+money);
    }
}
