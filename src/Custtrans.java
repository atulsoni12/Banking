public class Custtrans extends transdef{
    public static void main(String[] args) {

        //create cust1
        transdef cust1 = new transdef();
        cust1.deposit(500);

        //create cust2
        transdef cust2 = new transdef();
        cust2.deposit(100);

        //get balance
        System.out.println(cust1.getBalance());
        System.out.println(cust2.getBalance());
    }


}

