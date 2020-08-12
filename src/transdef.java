

import java.io.InputStream;

public class transdef extends CustAccount {
    private double balance;

    //set balance to zero
    public transdef(){
        balance = 0.0;
    }

    //deposit
    public void deposit(double amount){
        balance = balance + amount;

    }

    //withdrawal
    public void withdrawal(double amount){
        balance= balance - amount;
    }


    //Get balance
    public double getBalance() {
        return balance;
    }
    public void Inputstream(InputStream in) {
    }

}
