package learn.behavioral.chain.of.responsibility.account;

/**
 * @author anthonylee
 */
public class Paypal extends Account {
    public Paypal(int balance) {
        this.name = "Paypal";
        this.balance = balance;
    }
}
