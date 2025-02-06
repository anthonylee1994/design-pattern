package learn.behavioral.chain.of.responsibility.account;

/**
 * @author anthonylee
 */
public class Bank extends Account {
    public Bank(int balance) {
        this.name = "銀行";
        this.balance = balance;
    }
}
